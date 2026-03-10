package com.example.mykoincmpapplication

import android.util.Log

class AndroidLogger : Logger {

    override fun log(message: String) {
        Log.d("App", message)
    }
}
