# Contributing to Llmrix Devtool Plugins

First off, thank you for considering contributing to Llmrix Devtool! It's people like you who make Llmrix a great tool for everyone.

## Code of Conduct

By participating in this project, you agree to abide by our Code of Conduct. (Maintain a professional and respectful environment).

## How Can I Contribute?

### Reporting Bugs
- Use the [GitHub Issues](https://github.com/llmrix/llmrix-devtool-plugin/issues) to report bugs.
- Describe the bug in detail and provide steps to reproduce it.

### Suggesting Enhancements
- Open a GitHub Issue with the tag `enhancement`.
- Explain why this feature would be useful and how it should work.

### Pull Requests
1. **Fork** the repository and create your branch from `master`.
2. **Setup** the development environment:
   ```bash
   pnpm install
   ```
3. **Commit** your changes using descriptive commit messages.
4. **Build** and test your changes:
   - For Zed: Verify `plugins/zed/extension.toml`.
   - For JetBrains: Run `./gradlew buildPlugin`.
5. **Push** to your fork and submit a **Pull Request** to our `master` branch.

## Project Structure

- `plugins/zed/`: Zed extension source and configuration.
- `plugins/jetbrains/`: IntelliJ IDEA / JetBrains plugin source (Kotlin/Gradle).
- `assets/`: Logos and visual assets.

## Development Notes

- **Version Sync**: If you update the version, please update it in the root `package.json` and run `pnpm sync-versions`.
- **Licensing**: All contributions will be licensed under the MIT License.

---

Happy coding!
