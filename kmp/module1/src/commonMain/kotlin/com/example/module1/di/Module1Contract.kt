package com.example.module1.di

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module2.di.NativeDependency
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

fun startModule1(
    dependency1: NativeDependency<NativePlatformDependency1>,
) {
    loadKoinModules(
        module {
            factory<NativePlatformDependency1> { dependency1() }
        }
    )
}