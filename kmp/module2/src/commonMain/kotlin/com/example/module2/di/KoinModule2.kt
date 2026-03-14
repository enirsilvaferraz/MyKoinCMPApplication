package com.example.module2.di

import com.example.module2.dependencies.NativePlatformDependency2
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
@ComponentScan("com.example.module2")
class KoinModule2 {

    @Factory
    fun moduleProvider(): Module2DependencyProvider =
        Module2DependencyProviderWrapper.provider

    @Factory
    fun provideDependency2(provider: Module2DependencyProvider): NativePlatformDependency2 =
        provider.provideDependency2()
}

