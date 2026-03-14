package com.example.module1.di

import com.example.module1.dependencies.NativePlatformDependency1
import com.example.module1.dependencies.NativePlatformDependency2

interface Module1DependencyProvider {

    fun provideDependency1(): NativePlatformDependency1

    fun provideDependency2(): NativePlatformDependency2
}

