package com.example.module2.di

import com.example.module2.dependencies.NativePlatformDependency2
import org.koin.core.module.Module
import org.koin.core.scope.Scope
import org.koin.dsl.module

typealias NativeDependency<T> = Scope.() -> T

fun feature2Module(
    dependency2: NativeDependency<NativePlatformDependency2>,
): Module = module {
    factory<NativePlatformDependency2> { dependency2() }
}