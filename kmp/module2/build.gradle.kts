plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidMultiplatformLibrary)
    alias(libs.plugins.android.lint)
    alias(libs.plugins.koin.compiler)
}

kotlin {

    android {
        namespace = "com.example.module2"
        compileSdk {
            version = release(36) {
                minorApiLevel = 1
            }
        }
        minSdk = 35
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    )

    jvm()

    sourceSets {

        commonMain {
            dependencies {
                implementation(libs.kotlin.stdlib)

                implementation(project.dependencies.platform(libs.koin.bom))
                implementation(libs.koin.core)
                implementation(libs.koin.annotations)
            }
        }
    }
}