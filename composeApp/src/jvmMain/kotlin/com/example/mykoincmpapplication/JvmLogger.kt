package com.example.mykoincmpapplication

class JvmLogger : Logger {

    override fun log(message: String) {
        println("[JVM] $message")
    }
}
