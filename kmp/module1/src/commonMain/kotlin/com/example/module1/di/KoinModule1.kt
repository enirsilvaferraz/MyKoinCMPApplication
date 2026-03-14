package com.example.module1.di

import com.example.module1.dependencies.NativePlatformDependency1
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Factory
import org.koin.core.annotation.Module

@Module
@ComponentScan("com.example.module1")
class KoinModule1

