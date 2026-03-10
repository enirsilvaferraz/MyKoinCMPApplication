package com.example.mykoincmpapplication

import android.util.Log

class AndroidInterfaceDependency : InterfaceDependency {

    override fun doSomething() {
        Log.d("AndroidInterfaceDependency", "Doing Android something")
    }
}
