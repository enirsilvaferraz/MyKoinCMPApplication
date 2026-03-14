package com.example.module1.di

import com.example.module1.dependencies.NativePlatformDependency1

interface Module1DependencyProvider {

    fun provideDependency1(): NativePlatformDependency1
}

