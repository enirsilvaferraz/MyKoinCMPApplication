package com.example.module1.di

import com.example.module1.dependencies.Module1Dependency1
import com.example.module1.dependencies.Module1Dependency2

interface Module1DependencyProvider {

    fun provideDependency1(): Module1Dependency1

    fun provideDependency2(): Module1Dependency2
}

