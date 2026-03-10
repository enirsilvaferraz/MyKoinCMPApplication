package com.example.mykoincmpapplication

class AndroidPlatformProvider : FeatureAPlatformProvider, FeatureBPlatformProvider {

    override fun getInterfaceDependency(): InterfaceDependency = AndroidInterfaceDependency()

    override fun getLogger(): Logger = AndroidLogger()
}
