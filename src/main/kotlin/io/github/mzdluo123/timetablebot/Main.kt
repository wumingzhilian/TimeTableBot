package io.github.mzdluo123.timetablebot

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.github.mzdluo123.timetablebot.bots.BotsManager
import io.github.mzdluo123.timetablebot.bots.listeners.BaseListeners
import io.github.mzdluo123.timetablebot.config.AppConfig
import io.github.mzdluo123.timetablebot.db.Class
import io.github.mzdluo123.timetablebot.db.ClassCourse
import io.github.mzdluo123.timetablebot.db.Course
import io.github.mzdluo123.timetablebot.db.User
import io.github.mzdluo123.timetablebot.utils.logger
import io.github.mzdluo123.timetablebot.utils.timeToStr
import io.io.github.mzdluo123.timetablebot.BuildConfig
import kotlinx.coroutines.Job
import kotlinx.coroutines.joinAll
import net.mamoe.mirai.event.registerEvents
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import java.io.File

private val mainLogger = logger()

internal val appJob = Job()

suspend fun main(args: Array<String>) {
    println(
        """
 _________  ___  _____ ______   _______  _________  ________  ________  ___       _______   ________  ________  _________   
|\___   ___\\  \|\   _ \  _   \|\  ___ \|\___   ___\\   __  \|\   __  \|\  \     |\  ___ \ |\   __  \|\   __  \|\___   ___\ 
\|___ \  \_\ \  \ \  \\\__\ \  \ \   __/\|___ \  \_\ \  \|\  \ \  \|\ /\ \  \    \ \   __/|\ \  \|\ /\ \  \|\  \|___ \  \_| 
     \ \  \ \ \  \ \  \\|__| \  \ \  \_|/__  \ \  \ \ \   __  \ \   __  \ \  \    \ \  \_|/_\ \   __  \ \  \\\  \   \ \  \  
      \ \  \ \ \  \ \  \    \ \  \ \  \_|\ \  \ \  \ \ \  \ \  \ \  \|\  \ \  \____\ \  \_|\ \ \  \|\  \ \  \\\  \   \ \  \ 
       \ \__\ \ \__\ \__\    \ \__\ \_______\  \ \__\ \ \__\ \__\ \_______\ \_______\ \_______\ \_______\ \_______\   \ \__\
        \|__|  \|__|\|__|     \|__|\|_______|   \|__|  \|__|\|__|\|_______|\|_______|\|_______|\|_______|\|_______|    \|__|
    """.trimIndent()
    )
    Runtime.getRuntime().addShutdownHook(Thread {
        mainLogger.info("shutting down...")
        appJob.cancel()
    })

    mainLogger.info("TimeTableBot ${BuildConfig.VERSION} build ${timeToStr(BuildConfig.BUILD_UNIXTIME)} loading.... ")

    mainLogger.info("loading config.")

    val configFile = if (args.isNotEmpty()) {
        File(args[0])
    } else {
        File("config.yml")
    }
    if (!configFile.exists()) {
        mainLogger.fatal("${configFile.name} not exists!")
        return
    }
    AppConfig.loadConfig(configFile)
    mainLogger.info("config loaded")

    mainLogger.info("connecting database")

    val dbConfig = HikariConfig().apply {
        jdbcUrl = AppConfig.getInstance().dbUrl
        driverClassName = "com.mysql.cj.jdbc.Driver"
        username = AppConfig.getInstance().dbUser
        password = AppConfig.getInstance().dbPwd
        maximumPoolSize = 5
    }
    val dataSource = HikariDataSource(dbConfig)
    Database.connect(dataSource)
    transaction {
        SchemaUtils.create(User, Class, ClassCourse, Course)
    }
    mainLogger.info("database connected")
    BaseListeners.listeners.forEach {
        BotsManager.registerEvents(it)
    }
    mainLogger.info("event listener registered")
    BotsManager.loginBots(AppConfig.getInstance().botAccounts)
    joinAll(BotsManager.jobs)
}

