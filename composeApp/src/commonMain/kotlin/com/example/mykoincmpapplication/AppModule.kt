package com.example.mykoincmpapplication

import com.example.module1.di.KoinModule1
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.KoinApplication

@KoinApplication(
    modules = [
        KoinModule1::class
    ]
)
@ComponentScan("com.example.mykoincmpapplication")
class AppModule