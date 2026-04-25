import * as fs from 'fs';
import * as path from 'path';

// 这是一个简单的版本同步脚本示例
// 它会读取根目录 package.json 的版本，并同步到所有插件配置中

const rootPkg = JSON.parse(fs.readFileSync(path.join(__dirname, '../package.json'), 'utf-8'));
const version = rootPkg.version;

console.log(`Syncing version ${version} to all plugins...`);

// 1. Sync to Zed (extension.toml)
const zedPath = path.join(__dirname, '../plugins/zed/extension.toml');
if (fs.existsSync(zedPath)) {
    let content = fs.readFileSync(zedPath, 'utf-8');
    content = content.replace(/version\s*=\s*".*"/, `version = "${version}"`);
    fs.writeFileSync(zedPath, content);
    console.log('Updated Zed extension.toml');
}

// 2. Sync to JetBrains (build.gradle.kts)
const jbPath = path.join(__dirname, '../plugins/jetbrains/build.gradle.kts');
if (fs.existsSync(jbPath)) {
    let content = fs.readFileSync(jbPath, 'utf-8');
    content = content.replace(/version\s*=\s*".*"/, `version = "${version}"`);
    fs.writeFileSync(jbPath, content);
    console.log('Updated JetBrains build.gradle.kts');
}

console.log('Done!');
