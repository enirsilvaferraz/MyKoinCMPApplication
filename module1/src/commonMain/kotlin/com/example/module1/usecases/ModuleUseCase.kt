package com.example.module1.usecases

import com.example.module1.dependencies.Module1Dependency1
import com.example.module1.dependencies.Module1Dependency2
import org.koin.core.annotation.Factory

@Factory
class ModuleUseCase(
    private val dependency1: Module1Dependency1,
    private val dependency2: Module1Dependency2
) {

    fun doSomething() {
        dependency1.doSomething()
        dependency2.doSomething()
    }
}