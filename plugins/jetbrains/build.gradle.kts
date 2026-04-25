plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("org.jetbrains.intellij.platform") version "2.0.1"
}

group = "com.llmrix"
version = "0.1.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.1")
        bundledPlugins("com.intellij.modules.ai.assistant")
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "com.llmrix.devtool"
        name = "Llmrix Devtool"
        vendor {
            name = "llmrix"
        }
    }
}
