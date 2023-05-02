// Top-level build file where you can add configuration options common to all sub-projects/modules.
// TODO: remove once Gradle is >= 8.1
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}