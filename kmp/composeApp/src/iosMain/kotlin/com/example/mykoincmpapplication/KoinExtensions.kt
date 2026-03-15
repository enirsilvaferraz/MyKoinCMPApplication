package com.example.mykoincmpapplication

import org.koin.core.KoinApplication
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module

fun loadModule(module: Module) {
    loadKoinModules(module)
}

fun KoinApplication.loadModule(module: Module) {
    modules(module)
}