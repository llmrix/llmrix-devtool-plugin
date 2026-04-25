package com.llmrix.devtool

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.project.Project

class LlmrixAgentServer {
    fun getCommandLine(project: Project): GeneralCommandLine {
        return GeneralCommandLine("npx")
            .withParameters("-y", "llmrix-devtool", "acp")
            .withWorkDirectory(project.basePath)
            .withEnvironment(mapOf("TERM" to "xterm-256color"))
    }
}
