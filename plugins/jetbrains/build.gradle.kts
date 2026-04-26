plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    id("org.jetbrains.intellij.platform") version "2.1.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
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
        // Use the downloaded IDE version for cross-platform compatibility
        intellijIdeaCommunity("2024.3")
        plugin("com.intellij.ml.llm", "243.23654.270.16")
        instrumentationTools()
        pluginVerifier()
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
            url = "https://www.llmrix.com"
            email = "support@llmrix.com"
        }
    }
    pluginVerification {
        ides {
            recommended()
        }
    }
}
