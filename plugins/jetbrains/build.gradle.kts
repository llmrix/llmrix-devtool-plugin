plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("org.jetbrains.intellij.platform") version "2.15.0"
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
        intellijIdeaCommunity("2024.3")
        // AI Assistant (com.intellij.ml.llm) is bundled in 2024.3+, no external dependency needed
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "com.llmrix.devtool"
        name = "Llmrix Devtool"
        version = "0.1.0"
        ideaVersion {
            sinceBuild = "243"
        }
        vendor {
            name = "llmrix"
            url = "https://llmrix.com"
            email = "support@llmrix.com"
        }
    }
}
