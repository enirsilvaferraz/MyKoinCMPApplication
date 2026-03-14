package com.example.mykoincmpapplication

import com.example.module2.dependencies.NativePlatformDependency2

class Dependency2 : NativePlatformDependency2 {

    override fun doSomething(): String {
        return "[Android] Module Dependency2"
    }
}