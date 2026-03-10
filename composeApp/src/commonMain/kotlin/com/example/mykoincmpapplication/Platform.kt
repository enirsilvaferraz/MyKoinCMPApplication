package com.example.mykoincmpapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform