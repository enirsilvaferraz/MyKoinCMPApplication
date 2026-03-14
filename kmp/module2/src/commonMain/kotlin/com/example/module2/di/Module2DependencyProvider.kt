package com.example.module2.di

import com.example.module2.dependencies.NativePlatformDependency2

interface Module2DependencyProvider {

    fun provideDependency2(): NativePlatformDependency2
}

