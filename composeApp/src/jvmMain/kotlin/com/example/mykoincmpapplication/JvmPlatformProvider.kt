package com.example.mykoincmpapplication

class JvmPlatformProvider : FeatureAPlatformProvider, FeatureBPlatformProvider {

    override fun getInterfaceDependency(): InterfaceDependency = JvmInterfaceDependency()

    override fun getLogger(): Logger = JvmLogger()
}
