package com.example.module2.di

fun startModule2(provider: Module2DependencyProvider) {
    Module2DependencyProviderWrapper.provider = provider
}