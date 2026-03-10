package com.example.mykoincmpapplication

import org.koin.core.context.startKoin
import org.koin.core.module.Module

fun initKoin(
    featureAProvider: FeatureAPlatformProvider,
    featureBProvider: FeatureBPlatformProvider,
    additionalModules: List<Module> = emptyList()
) {
    startKoin {
        modules(
            listOf(
                featureAPlatformModule(featureAProvider),
                featureBPlatformModule(featureBProvider)
            ) + additionalModules
        )
    }
}
