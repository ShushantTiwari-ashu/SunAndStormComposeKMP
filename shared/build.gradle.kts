@file:Suppress("UnstableApiUsage")

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("kotlinx-serialization")
    id("com.google.devtools.ksp")
    id("org.jetbrains.compose")
    id("com.rickclephas.kmp.nativecoroutines")
}

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm("desktop")

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "16.0"
        podfile = project.file("../cleanmilesIos/Podfile")
        framework {
            baseName = "shared"
            isStatic = true
        }
        extraSpecAttributes["resources"] =
            "['src/commonMain/resources/**', 'src/iosMain/resources/**']"
    }

    @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
    sourceSets {
        val commonMain by getting {
            dependencies {
                with(libs.ktor) {
                    implementation(core)
                    implementation(client.json)
                    implementation(logging)
                    implementation(client.serialization)
                    implementation(content.negotiation)
                    implementation(json)
                }

                with(libs.kotlinx) {
                    implementation(coroutines.core)
                    implementation(serialization.core)
                    implementation(datetime)
                }

                api(libs.multiplatform.settings)
                api(libs.multiplatform.settings.coroutines)
                api(libs.compose.resource)
                api(libs.imageloader)
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting{
            dependencies {
                implementation(libs.ktor.client.android)
            }
        }
        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
            dependencies {
                implementation(libs.ktor.client.ios1)
                implementation(libs.ktor.client.ios)
            }
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.common)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.6.4")
                implementation("io.ktor:ktor-client-cio:2.2.3")
            }
        }
    }
}

android {
    compileSdk = 33
    namespace = "dev.shushant.cleanmiles"
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDir("src/commonMain/resources")
    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }
}