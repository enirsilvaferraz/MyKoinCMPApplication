package com.example.mykoincmpapplication

import com.example.module2.dependencies.NativePlatformDependency2

class AndroidDependency2 : NativePlatformDependency2 {

    override fun doSomething(): String {
        return "[Android] Module Dependency2"
    }
}