package com.example.mykoincmpapplication

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.module1.di.startModule1

fun main() {

    startModule1(JVMProvider())

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "MyKoinCMPApplication",
        ) {
            App()
        }
    }
}