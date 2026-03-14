package com.example.mykoincmpapplication

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module1.dependencies.NativePlatformDependency2
import com.example.module1.di.Module1DependencyProvider

class JVMProvider : Module1DependencyProvider {

    override fun provideDependency1(): NativePlatformDependency1 {
        return Dependency1()
    }

    override fun provideDependency2(): NativePlatformDependency2 {
        return Dependency2()
    }
}

class Dependency1 : NativePlatformDependency1 {

    override fun doSomething(): String {
        return "[JVM] Module1 Dependency1"
    }
}

class Dependency2 : NativePlatformDependency2 {

    override fun doSomething(): String {
        return "[JVM] Module1 Dependency2"
    }
}