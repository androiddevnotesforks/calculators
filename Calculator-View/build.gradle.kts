import org.gradle.kotlin.dsl.register

// Top-level build file where you can add configuration options common to all subprojects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks.register<Delete>("clean") {
    description = "Clean build directory"
    delete(rootProject.layout.buildDirectory)
}
