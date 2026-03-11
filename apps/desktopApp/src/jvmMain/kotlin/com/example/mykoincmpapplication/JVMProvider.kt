package com.example.mykoincmpapplication

import com.example.module1.dependencies.Module1Dependency1
import com.example.module1.dependencies.Module1Dependency2
import com.example.module1.di.Module1DependencyProvider

class JVMProvider: Module1DependencyProvider {

    override fun provideDependency1(): Module1Dependency1 {
        return Dependency1()
    }

    override fun provideDependency2(): Module1Dependency2 {
        return Dependency2()
    }
}

class Dependency1: Module1Dependency1 {

    override fun doSomething() {
        println("[JVM] Module1 Dependency1")
    }
}

class Dependency2: Module1Dependency2 {

    override fun doSomething() {
        println("[JVM] Module1 Dependency2")
    }
}