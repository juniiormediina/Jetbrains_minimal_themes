plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.21"
    id("org.jetbrains.intellij.platform") version "2.10.5"
}

group = "com.minimal.themes"
version = "1.0.0"

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        // Usar Community Edition para sandbox sin licencia
        intellijIdeaCommunity("2024.2")
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Minimal Themes"
    }
}
