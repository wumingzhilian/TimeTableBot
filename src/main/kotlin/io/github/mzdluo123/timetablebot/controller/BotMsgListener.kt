package io.github.mzdluo123.timetablebot.controller


import io.github.mzdluo123.timetablebot.BuildConfig
import io.github.mzdluo123.timetablebot.bots.BotsManager
import io.github.mzdluo123.timetablebot.config.AppConfig
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Classroom.CLASSROOM
import io.github.mzdluo123.timetablebot.gen.timetable.tables.Course.COURSE
import io.github.mzdluo123.timetablebot.gen.timetable.tables.CourseTime.COURSE_TIME
import io.github.mzdluo123.timetablebot.gen.timetable.tables.User.USER
import io.github.mzdluo123.timetablebot.gen.timetable.tables.UserCourse.USER_COURSE
import io.github.mzdluo123.timetablebot.gen.timetable.tables.daos.UserDao
import io.github.mzdluo123.timetablebot.gen.timetable.tables.pojos.User
import io.github.mzdluo123.timetablebot.route.CommandRouter
import io.github.mzdluo123.timetablebot.route.cmdArg
import io.github.mzdluo123.timetablebot.route.requireAdminPermission
import io.github.mzdluo123.timetablebot.route.route
import io.github.mzdluo123.timetablebot.task.SyncRequest
import io.github.mzdluo123.timetablebot.task.SyncTask
import io.github.mzdluo123.timetablebot.utils.*
import net.mamoe.mirai.event.EventHandler
import net.mamoe.mirai.message.FriendMessageEvent
import net.mamoe.mirai.message.data.PlainText
import org.jooq.Record10
import org.jooq.Record7
import org.jooq.Record9
import org.jooq.Result
import java.time.LocalDateTime


class BotMsgListener : BaseListeners() {
    private val userDao = createDao(UserDao::class)

    @EventHandler
    suspend fun FriendMessageEvent.onEvent() {
        val user = userDao.fetchOneByAccount(sender.id)
        route(prefix = "", delimiter = " ") {
            exception { throwable ->
                PlainText(throwable.toString())
            }
            case("init", "设置学号") {
                val arg2: Int by cmdArg(0, "学号", it)
                if (user != null) {
                    userDao.update(user.apply {
                        studentId = arg2
                    })
                    reply(PlainText("设置学号成功"))
                } else {
                    userDao.insert(User().apply {
                        account = sender.id
                        bot = sender.bot.id
                        joinTime = LocalDateTime.now()
                        enable = 0.toByte()
                        studentId = arg2
                    })
                    reply(PlainText("创建账号成功"))
                }
            }
            case("sync", "从教务系统同步课程表") {

                if (user == null) {
                    reply("你没有创建账号，请使用init创建账户")
                    return@case
                }
                val arg: String by cmdArg(0, "密码", it)
                SyncTask.requestSync(SyncRequest(user.id, arg))
                reply("我们将在后台刷新你的课程表，完成后会向你发送信息，请稍后\n同步较慢，请勿重复提交")

            }
            case("td", "退订自动推送服务") {
                if (user == null) {
                    reply("你没有创建账号，请使用init创建账户")
                    return@case
                }
                if (user.enable == 1.toByte()) {
                    userDao.update(user.apply {
                        enable = 0.toByte()
                    })
                    reply("退订成功")
                } else {
                    reply("您已退订自动推送服务")
                }

            }

            case("dy", "订阅自动推送服务") {
                if (user == null) {
                    reply("你没有创建账号，请使用init创建账户")
                    return@case
                }
                if (user.enable == 0.toByte()) {
                    userDao.update(user.apply {
                        enable = 1.toByte()
                    })
                    reply("订阅启用成功！")
                } else {
                    reply("您已订阅自动推送服务")
                }
            }
            case("next", "查询下节课") {
                if (user == null) {
                    reply("你没有创建账号，请使用init创建账户")
                    return@case
                }
                val nextClass = nextClass(user)
                reply(nextClass)
            }
            case("bug反馈", "将bug反馈给开发者，帮助我们进行完善") {
                val arg: String by cmdArg(0, "bug", it)
                val list = AppConfig.getInstance().admin
                for (u in AppConfig.getInstance().admin) {
                    bot.getFriend(u).sendMessage("来自用户${user.account}的反馈:" + arg)
                }
                reply("您反馈的问题我们已经收到，如果您还有疑问，请联系管理员")
            }
            case("今日课表", "获取今天的所有课程") {
                if (user == null) {
                    reply("你没有创建账号，请使用init创建账户")
                    return@case
                }
                val course = searchTodayClass(week(), dayOfWeek(), user)
                val msg = if (course != null && course.size >= 1) {
                    course.joinToString(separator = "\n") {
                        """
${it.component1()}
${it.component3()} 
时间：${AppConfig.getInstance().classTime[it.component7().toInt() - 1]} (第${it.component7()}节)                             
--------------
""".trimIndent()
                    }

                } else {
                    "您今日没有课哦~"
                }
                reply(msg)
            }
            case("clean", "清除你的课程表") {
                val confirm: Boolean by cmdArg(0, "你确定要清除你的课程表?", it)
                if (confirm) {
                    val courses = dbCtx {
                        it.delete(USER_COURSE).where(USER_COURSE.USER.eq(user.id)).execute()
                    }
                    reply("删除了${courses}条记录")
                } else {
                    reply("已取消")
                }

            }
            nextRoute("admin", "管理中心", ::admin)
            default {
                reply(PlainText(AppConfig.getInstance().help))
                reply(PlainText("TimeTableBot ${BuildConfig.VERSION} build ${timeToStr(BuildConfig.BUILD_UNIXTIME)}\n${generateHelp()}"))
            }

        }

    }

    private suspend fun admin(route: CommandRouter<FriendMessageEvent>) {
        route.exception {
            PlainText(it.toString())
        }
        route.event.requireAdminPermission()
        route.case("reload", "重载帮助") {
            AppConfig.loadHelp()
            reply("帮助重载成功!")
        }
        route.case("send", "广播消息到所有用户") {
            val msg: String by cmdArg(0, "要广播的消息", it)
            val users = dbCtx { it.select(USER.ACCOUNT, USER.BOT).from(USER).where(USER.ENABLE.eq(1)).fetch() }
            for (user in users) {
                BotsManager.sendMsg(
                    user.component2(),
                    user.component1(),
                    PlainText("$msg\n(此消息由管理员发送，请勿回复，如有问题请联系管理员)")
                )
            }
        }
        route.case("state", "获取运行状态") {
            val msg = buildString {
                append("TimeTableBot ${BuildConfig.VERSION} build ${timeToStr(BuildConfig.BUILD_UNIXTIME)}\n")
                val totalUser = dbCtx {
                    it.fetchCount(USER)
                }
                append("用户数:${totalUser}\n")
                val validUser = dbCtx {
                    it.fetchCount(USER, USER.NAME.isNotNull)
                }
                append("有效用户:${validUser}\n")
                append("下节课:${nextClassIndex()}\n")
                val courses = dbCtx {
                    it.fetchCount(COURSE)
                }
                append("记录的课程数量:${courses}")
            }
            reply(msg)
        }
        route.default {

            reply(PlainText(route.generateHelp()))
        }
    }
}

fun searchTodayClass(
    week: Int,
    dayOfWeek: Int,
    user: User
): Result<Record7<String, String, String, Double, Byte, Byte, Byte>>? {
    val course = dbCtx {
        return@dbCtx it.select(
            COURSE.NAME,
            COURSE.TEACHER,
            CLASSROOM.LOCATION,
            COURSE.SCORE,
            COURSE.WEEK_PERIOD,
            COURSE.PERIOD,
            COURSE_TIME.START_TIME
        )
            .from(
                USER_COURSE.innerJoin(USER).on(USER_COURSE.USER.eq(USER.ID))
                    .innerJoin(COURSE).on(USER_COURSE.COURSE.eq(COURSE.ID))
                    .innerJoin(COURSE_TIME).on(COURSE_TIME.COURSE.eq(COURSE.ID))
                    .innerJoin(CLASSROOM).on(COURSE_TIME.CLASS_ROOM.eq(CLASSROOM.ID))

            )
            .where(
                COURSE_TIME.WEEK.eq(week.toByte())
                    .and(USER.ID.eq(user.id))
                    .and(COURSE_TIME.DAY_OF_WEEK.eq(dayOfWeek.toByte()))
            )
            .orderBy(
                COURSE_TIME.START_TIME
            )
            .fetch()
    }
    return course
}

fun searchNextClass(
    week: Int,
    dayOfWeek: Int,
    user: User
): Record10<String, Int, Long, Byte, Byte, Byte, String, Int, Double, String>? {
    if (nextClassIndex() == Int.MAX_VALUE) return null
    val cource = dbCtx {
        return@dbCtx it.select(
            COURSE.NAME,
            USER.ID,
            USER.ACCOUNT,
            COURSE_TIME.DAY_OF_WEEK,
            COURSE_TIME.WEEK,
            COURSE_TIME.START_TIME,
            USER.NAME,
            COURSE_TIME.CLASS_ROOM,
            COURSE.SCORE,
            CLASSROOM.LOCATION
        )
            .from(
                COURSE
                    .innerJoin(USER_COURSE).on(COURSE.ID.eq(USER_COURSE.COURSE))
                    .innerJoin(USER).on(USER.ID.eq(USER_COURSE.USER))
                    .innerJoin(COURSE_TIME).on(COURSE.ID.eq(COURSE_TIME.COURSE))
                    .innerJoin(CLASSROOM).on(COURSE_TIME.CLASS_ROOM.eq(CLASSROOM.ID))
            )
            .where(
                COURSE_TIME.WEEK.eq(week.toByte())
                    .and(USER.ID.eq(user.id))
                    .and(COURSE_TIME.DAY_OF_WEEK.eq(dayOfWeek.toByte()))
                    .and(COURSE_TIME.START_TIME.ge(nextClassIndex().toByte())),
            )
            .groupBy(USER.ID).fetchOne()
    }
    return cource
}

fun searchTomorrowNextClass(
    week: Int,
    dayOfWeek: Int,
    user: User
): Record9<String, Int, Long, Byte, Byte, Byte, Double, String, String>? {
    val cource = dbCtx {
        return@dbCtx it.select(
            COURSE.NAME,
            USER.ID,
            USER.ACCOUNT,
            COURSE_TIME.DAY_OF_WEEK,
            COURSE_TIME.WEEK,
            COURSE_TIME.START_TIME,
            COURSE.SCORE,
            USER.NAME,
            CLASSROOM.LOCATION
        )
            .from(
                COURSE
                    .innerJoin(USER_COURSE).on(COURSE.ID.eq(USER_COURSE.COURSE))
                    .innerJoin(USER).on(USER.ID.eq(USER_COURSE.USER))
                    .innerJoin(COURSE_TIME).on(COURSE.ID.eq(COURSE_TIME.COURSE))
                    .innerJoin(CLASSROOM).on(COURSE_TIME.CLASS_ROOM.eq(CLASSROOM.ID))
            )
            .where(
                COURSE_TIME.WEEK.eq(week.toByte())
                    .and(USER.ID.eq(user.id))
                    .and(COURSE_TIME.DAY_OF_WEEK.eq(dayOfWeek.toByte()))
            )
            .groupBy(USER.ID).fetchOne()
    }
    return cource
}

fun nextClass(user: User): String {
    var dayOfWeek = dayOfWeek()
    var week = week()
    val course = searchNextClass(week, dayOfWeek, user)
    return if (course != null) {
        buildString {
            append("您好!接下来是第${course.getValue(COURSE_TIME.START_TIME)}节课，上课时间${AppConfig.getInstance().classTime[course.component6() - 1]}\n")
            append(
                "${course.getValue(COURSE.NAME)}，在${course.getValue(CLASSROOM.LOCATION)}，${
                    course.getValue(
                        COURSE.SCORE
                    )
                }个学分"
            )
        }
    } else {
        //查询第二天的课表
        buildString {

            if (dayOfWeek == 7) {
                dayOfWeek = 1
                week++
            } else {
                dayOfWeek++
            }
            val course = searchTomorrowNextClass(week, dayOfWeek, user)
            if (course != null) {
                append(
                    "您今日已无课，接下来是明天的第${course.component6()}节课," +
                            "上课时间${AppConfig.getInstance().classTime[course.component6().toInt() - 1]}\n"
                )
                append(
                    "${course.getValue(COURSE.NAME)}，在${course.getValue(CLASSROOM.LOCATION)}，${
                        course.getValue(
                            COURSE.SCORE
                        )
                    }个学分"
                )
            } else {
                append("您暂时没有课了哦(*/ω＼*)")
            }
        }
    }
}