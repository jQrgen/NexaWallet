pluginManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        gradlePluginPortal()
    }
}

include(":app", ":shared")
rootProject.name = "KaMPKit"

// enableFeaturePreview("VERSION_CATALOGS")
