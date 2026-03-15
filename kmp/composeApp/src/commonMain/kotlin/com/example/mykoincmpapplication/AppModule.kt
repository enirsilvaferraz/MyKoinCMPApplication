package com.example.mykoincmpapplication

import com.example.module1.di.KoinModule1
import com.example.module2.di.KoinModule2
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.KoinApplication
import org.koin.core.annotation.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.plugin.module.dsl.startKoin

@KoinApplication(
    modules = [
        KoinModule1::class,
        KoinModule2::class,
        ComposeModule::class
    ]
)
class AppModule

@Module
@ComponentScan("com.example.mykoincmpapplication")
class ComposeModule

fun initKoin(declarations: KoinAppDeclaration) {
    startKoin<AppModule>(declarations)
}