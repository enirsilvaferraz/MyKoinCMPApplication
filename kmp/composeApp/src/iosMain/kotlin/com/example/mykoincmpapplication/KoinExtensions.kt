package com.example.mykoincmpapplication

import org.koin.core.KoinApplication
import org.koin.core.module.Module

fun loadKoinModules(module: Module) {
    org.koin.core.context.loadKoinModules(module)
}

fun KoinApplication.modules(module: Module) {
    modules(module)
}