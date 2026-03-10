package com.example.mykoincmpapplication

import org.koin.core.module.Module
import org.koin.dsl.module

fun featureAPlatformModule(provider: FeatureAPlatformProvider): Module = module {
    single<InterfaceDependency> { provider.getInterfaceDependency() }
}

fun featureBPlatformModule(provider: FeatureBPlatformProvider): Module = module {
    single<Logger> { provider.getLogger() }
}
