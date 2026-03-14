package com.example.module2.di

import com.example.module2.dependencies.NativePlatformDependency2
import org.koin.core.KoinApplication
import org.koin.core.context.loadKoinModules
import org.koin.core.scope.Scope
import org.koin.dsl.module

typealias NativeDependency<T> = Scope.() -> T

fun startModule2(
    dependency2: NativeDependency<NativePlatformDependency2>,
) {
    loadKoinModules(
        module {
            factory<NativePlatformDependency2> { dependency2() }
        }
    )
}