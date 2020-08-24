package io.github.mzdluo123.timetablebot.bots.listeners

import net.mamoe.mirai.event.SimpleListenerHost
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.util.StackLocatorUtil
import kotlin.coroutines.CoroutineContext

open class BaseListeners : SimpleListenerHost() {
    protected val logger: Logger
        get() = LogManager.getLogger(StackLocatorUtil.getCallerClass(2).name)


    override fun handleException(context: CoroutineContext, exception: Throwable) {
        logger.error(exception)
    }

    companion object {
        val listeners = listOf(
            BotMsgListener(),
            BotFriendRequestsListener()
        )
    }
}