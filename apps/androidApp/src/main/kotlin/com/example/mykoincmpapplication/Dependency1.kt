package com.example.mykoincmpapplication

import com.example.module1.dependencies.NativePlatformDependency1

class Dependency1 : NativePlatformDependency1 {

    override fun doSomething(): String {
        return "[Android] Module Dependency1"
    }
}