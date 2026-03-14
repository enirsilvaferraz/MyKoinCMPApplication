package com.example.module1.usecases

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module2.dependencies.NativePlatformDependency2
import org.koin.core.annotation.Factory

@Factory
class ModuleUseCase(
    private val dependency1: NativePlatformDependency1,
    private val dependency2: NativePlatformDependency2,
) {

    fun doSomething1(): String {
        return dependency1.doSomething()
    }

    fun doSomething2(): String {
        return dependency2.doSomething()
    }
}