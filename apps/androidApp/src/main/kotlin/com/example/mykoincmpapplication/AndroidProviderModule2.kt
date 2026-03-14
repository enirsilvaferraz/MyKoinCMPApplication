package com.example.mykoincmpapplication

import com.example.module2.dependencies.NativePlatformDependency2
import com.example.module2.di.Module2DependencyProvider

class AndroidProviderModule2 : Module2DependencyProvider {

    override fun provideDependency2(): NativePlatformDependency2 {
        return Dependency2()
    }
}