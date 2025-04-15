package org.sbot_chat.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform