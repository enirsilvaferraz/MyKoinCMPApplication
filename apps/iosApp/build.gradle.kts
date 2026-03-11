plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "IOSApp"
            isStatic = true
            export(projects.composeApp)
            export(projects.module1)
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(projects.composeApp)
            api(projects.module1)
        }
    }
}
