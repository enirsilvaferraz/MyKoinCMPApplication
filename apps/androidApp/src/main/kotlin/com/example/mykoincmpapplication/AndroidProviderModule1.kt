package com.example.mykoincmpapplication

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module1.di.Module1DependencyProvider

class AndroidProviderModule1 : Module1DependencyProvider {

    override fun provideDependency1(): NativePlatformDependency1 {
        return Dependency1()
    }
}