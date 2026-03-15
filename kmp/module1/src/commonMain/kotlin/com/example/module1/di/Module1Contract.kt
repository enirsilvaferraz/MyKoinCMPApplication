package com.example.module1.di

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module2.di.NativeDependency
import org.koin.core.module.Module
import org.koin.dsl.module

fun feature1Module(
    dependency1: NativeDependency<NativePlatformDependency1>,
): Module = module {
    factory<NativePlatformDependency1> { dependency1() }
}