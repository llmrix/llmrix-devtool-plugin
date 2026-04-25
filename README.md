<p align="center">
  <img src="assets/logo.png" width="320" alt="llmrix-devtool logo">
</p>

# Llmrix Devtool Plugins

This repository contains the IDE plugins for **Llmrix Devtool**, an AI coding assistant designed for autonomous development workflows. These plugins allow you to integrate Llmrix's multi-agent capabilities directly into your favorite editor.

## 🚀 Supported IDEs

- [Zed](#zed)
- [JetBrains IDEs](#jetbrains-ides) (IntelliJ IDEA, WebStorm, PyCharm, etc.)

---

## Zed

### Installation

Search for **"Llmrix Devtool"** in the Zed Extension Manager and click **Install**.

Or install via CLI:

```bash
zed --install-extension llmrix-devtool
```

### Prerequisites

- Node.js v18+

### Configuration

The extension runs the agent automatically via `npx` on first use. For faster startup, install globally:

```bash
npm install -g llmrix-devtool
```

Then configure your LLM provider:

```bash
npx llmrix-devtool config
```

Follow the prompts to set your provider and API key. Config is saved to `~/.llmrix/config/config.json`.

**Example config:**

```json
{
  "provider": "anthropic",
  "model": "claude-3-5-sonnet-latest",
  "providers": [
    {
      "id": "anthropic",
      "name": "Anthropic",
      "protocol": "anthropic",
      "apiKey": "${ANTHROPIC_API_KEY}",
      "models": ["claude-3-7-sonnet-latest", "claude-3-5-sonnet-latest", "claude-3-5-haiku-latest"]
    },
    {
      "id": "openai",
      "name": "OpenAI",
      "protocol": "openai",
      "apiKey": "${OPENAI_API_KEY}",
      "models": ["gpt-4o", "gpt-4o-mini", "o1", "o3-mini"]
    },
    {
      "id": "deepseek",
      "name": "DeepSeek",
      "protocol": "openai",
      "baseUrl": "https://api.deepseek.com/v1",
      "apiKey": "${DEEPSEEK_API_KEY}",
      "models": ["deepseek-chat", "deepseek-reasoner"]
    },
    {
      "id": "ollama",
      "name": "Ollama (local)",
      "protocol": "openai",
      "baseUrl": "http://localhost:11434/v1",
      "apiKey": "ollama",
      "models": ["qwen2.5-coder:7b", "llama3.1:8b"]
    }
  ]
}
```

### Usage

Open the Zed Agent panel, select **Llmrix**, and start chatting. The agent has full access to your workspace files and terminal.

---

## JetBrains IDEs

Supports IntelliJ IDEA, WebStorm, PyCharm, GoLand, and all other JetBrains IDEs 2024.3+.

### Installation

**Via Marketplace (recommended):**

1. Open your JetBrains IDE
2. Go to **Settings → Plugins → Marketplace**
3. Search for **"Llmrix Devtool"** and click **Install**
4. Restart the IDE

**Manual install:**

Download the latest `.zip` from [Releases](https://github.com/llmrix/llmrix-devtool-plugin/releases), then go to **Settings → Plugins → ⚙️ → Install Plugin from Disk**.

### Prerequisites

- JetBrains IDE 2024.3+
- JetBrains AI Assistant plugin (bundled in 2024.3+)
- Node.js v18+

### Configuration

The plugin starts the Llmrix agent server automatically — no manual setup needed.

1. Open the **AI Assistant** chat panel (`View → Tool Windows → AI Assistant`)
2. Click the agent picker and select **Llmrix Agent**
3. Start chatting

Configure your LLM provider the same way as Zed:

```bash
npx llmrix-devtool config
```

### Usage Example

Once the agent is selected in AI Assistant, you can delegate tasks like:

```
Refactor the UserService class to use dependency injection
```

```
Find and fix all TypeScript type errors in src/
```

```
Write unit tests for the PaymentController
```

The agent will read your files, make edits, and run commands autonomously.

---

## 🛠 Development

This is a pnpm workspace monorepo.

### Prerequisites

- Node.js & pnpm
- Java 21+ (for JetBrains plugin)

### Setup

```bash
pnpm install
```

### Build JetBrains Plugin

```bash
cd plugins/jetbrains
./gradlew buildPlugin
# Output: plugins/jetbrains/build/distributions/Llmrix Devtool-0.1.0.zip
```

### Version Sync

When bumping the version, update `package.json` then run:

```bash
pnpm sync-versions
```

This syncs the version to `plugins/zed/extension.toml` and `plugins/jetbrains/build.gradle.kts`.

### Publishing

See [scratch/publishing_guide.md](scratch/publishing_guide.md) for detailed marketplace publishing instructions.

---

## 📄 License

MIT — see [LICENSE](LICENSE) for details.

---

Built with ❤️ by [llmrix](https://github.com/llmrix)
