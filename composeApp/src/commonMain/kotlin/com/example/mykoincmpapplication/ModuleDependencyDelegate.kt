package com.example.mykoincmpapplication

interface ModuleDependencyDelegate {

    fun provideInterfaceDependency(): () -> InterfaceDependency
}