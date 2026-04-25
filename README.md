<p align="center">
  <img src="assets/logo.png" width="320" alt="llmrix-devtool logo">
</p>

# Llmrix Devtool Plugins

This repository contains the IDE plugins for **Llmrix Devtool**, an AI coding assistant designed for autonomous development workflows. These plugins allow you to integrate Llmrix's multi-agent capabilities directly into your favorite editor.

## 🚀 Supported IDEs

### [Zed](https://zed.dev)
The Llmrix Devtool extension for Zed provides a seamless integration using the Agent Client Protocol (ACP).

- **Features**: 
  - Integrated chat with Llmrix agents.
  - Direct file manipulation and terminal access through agents.
- **Installation**: Search for "Llmrix Devtool" in the Zed Extension Manager.

### [JetBrains IDEs](https://www.jetbrains.com/products/compare/?product=idea)
IntelliJ IDEA, WebStorm, PyCharm, and other JetBrains editors support Llmrix via our dedicated plugin.

- **Features**:
  - Integration with the IDE's AI Assistant.
  - Custom agent server support.
- **Build**: `./gradlew :plugins:jetbrains:buildPlugin`

## 🛠 Development

This is a pnpm workspace monorepo.

### Prerequisites
- Node.js & pnpm
- Java 17+ (for JetBrains plugin)

### Setup
```bash
pnpm install
```

### Publishing
For detailed publishing instructions for each marketplace, refer to [scratch/publishing_guide.md](scratch/publishing_guide.md).

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
Built with ❤️ by [llmrix](https://github.com/llmrix)
