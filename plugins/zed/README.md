# Llmrix Devtool for Zed

Llmrix Devtool is an AI coding agent for autonomous development workflows. This extension brings Llmrix's multi-agent capabilities directly into your Zed editor using the Agent Client Protocol (ACP).

## 📋 Prerequisites

- **Node.js (v18 or later)**: Required to run the agent server.
- **npm**: Usually comes with Node.js.

## 🚀 Installation & Usage

### 1. Install Extension
Search for **"Llmrix Devtool"** in the Zed Extension Manager and click install.

### 2. Automatic Setup (Default)
By default, the extension uses `npx` to run the agent. The first time you use it, there might be a short delay while it downloads the latest version of `llmrix-devtool`.

### 3. Manual Installation (Optional - Faster)
If you want to avoid the `npx` download delay or use the agent offline, you can install it globally:
```bash
npm install -g llmrix-devtool
```
The extension will automatically use the locally cached/installed version if available.

## ⚙️ Model Configuration

Llmrix requires an LLM provider to function. You can configure your API keys and preferred models through the `llmrix-devtool` CLI.

1. Open your terminal.
2. Run the configuration command:
   ```bash
   npx llmrix-devtool config
   ```
   *(Or just `llmrix-devtool config` if installed globally)*
3. Follow the interactive prompts to:
   - Select your provider (OpenAI, Anthropic, DeepSeek, etc.)
   - Enter your API Key.
   - Choose your default model (e.g., `gpt-4o`, `claude-3-5-sonnet`).

Your configuration will be saved in `~/.llmrix/config/`.

### Configuration Example

Here is an example of what a configured setting might look like (usually stored in `~/.llmrix/config/config.json`):

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
      "models": [
        "claude-3-7-sonnet-latest",
        "claude-3-5-sonnet-latest", 
        "claude-3-5-haiku-latest", 
        "claude-3-opus-latest"
      ]
    },
    {
      "id": "openai",
      "name": "OpenAI",
      "protocol": "openai",
      "apiKey": "${OPENAI_API_KEY}",
      "models": [
        "gpt-4o", 
        "gpt-4o-mini", 
        "o1", 
        "o3-mini"
      ]
    },
    {
      "id": "deepseek",
      "name": "DeepSeek",
      "protocol": "openai",
      "baseUrl": "https://api.deepseek.com/v1",
      "apiKey": "${DEEPSEEK_API_KEY}",
      "models": [
        "deepseek-chat", 
        "deepseek-coder", 
        "deepseek-reasoner"
      ]
    },
    {
      "id": "ollama",
      "name": "Ollama (local)",
      "protocol": "openai",
      "baseUrl": "http://localhost:11434/v1",
      "apiKey": "ollama",
      "models": [
        "qwen2.5-coder:7b",
        "qwen2.5-coder:32b",
        "codellama:13b",
        "llama3.1:8b"
      ]
    }
  ]
}
```


## 🛠 Features

- **Autonomous Coding**: Let Llmrix agents handle complex refactors, bug fixes, and feature implementations.
- **Context Awareness**: Agents have access to your workspace files and terminal.
- **ACP Integration**: Seamless communication between Zed and the Llmrix agent server.

## License

MIT
