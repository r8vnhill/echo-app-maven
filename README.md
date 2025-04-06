# echo-app-maven

This repository contains the source code for a modular Java project built with [Apache Maven](https://maven.apache.org/). It is designed to accompany **two lessons** from the [DIBS course](https://dibs.pages.dev), which walk you through the process of creating and scaling a Maven-based Java project.

> ✍️ While both lessons are written in Spanish, the code in this repository is fully in **English** to ensure accessibility for a broader audience.

## 📚 Companion Lessons

- [✅ Creating a Basic Maven Project](https://dibs.pages.dev/docs/build-systems/init/maven/)  
  Learn how to generate a simple Maven project using the `quickstart` archetype, define its metadata (`groupId`, `artifactId`, etc.), understand the default folder structure, and run your first Java app.

- [🏗️ Modular Architecture with Maven and Java](https://dibs.pages.dev/docs/build-systems/modular-design/maven.mdx/)  
  Take your project to the next level by transforming it into a multi-module setup with reusable components. You'll learn to separate responsibilities using a `lib` module and an `app` module, structure your POM files accordingly, and compile and run modular apps from the command line.

## 🧱 Project Structure

This is a **multi-module Maven project** with two main modules:

- **`lib`**: A library module that contains a simple utility method.
- **`app`**: The main application that consumes the utility from `lib`.

```
echo-app-maven/
├── pom.xml              # Root POM (parent)
├── lib/
│   ├── pom.xml          # Library module
│   └── src/main/java/com/github/username/echo/EchoUtils.java
├── app/
│   ├── pom.xml          # Application module
│   └── src/main/java/com/github/username/App.java
```

## 🚀 Build & Run

### Prerequisites

- Java 8 or higher
- Apache Maven 3.6 or later

### Commands

**Linux/macOS**

```bash
mvn clean install && \
mvn -pl app exec:java \
  -Dexec.mainClass=com.github.username.App \
  -Dexec.args="Ryugamine Celty Shizuo"
```

**Windows (PowerShell)**

```powershell
mvn clean install && `
mvn -pl app 'exec:java' `
  '-Dexec.mainClass=com.github.username.App' `
  '-Dexec.args=Ryugamine Celty Shizuo'
```

## 💬 Output Example

After a successful build, the output should include a lot of Maven logs followed by:

```
Ryugamine
Celty
Shizuo
```

## 🎓 Topics Covered

This repository demonstrates:

- Generating a basic Maven project using an archetype.
- Understanding project metadata: `groupId`, `artifactId`, `version`, and `package`.
- Creating a multi-module architecture with shared configuration.
- Reusing logic across modules using Maven dependencies.
- Running Java programs via `exec-maven-plugin`.

## ⚖️ License

This project is licensed under the [BSD-2-Clause License](LICENSE). Feel free to use, modify, and distribute it as per the terms of the license.
