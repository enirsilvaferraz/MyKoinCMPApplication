package com.example.mykoincmpapplication

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    val provider = JvmPlatformProvider()
    initKoin(
        featureAProvider = provider,
        featureBProvider = provider
    )

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "MyKoinCMPApplication",
        ) {
            App()
        }
    }
}