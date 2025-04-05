# echo-app-maven

> A modular Java application managed with Apache Maven.

This repository accompanies **two lessons** from the [Software Library Design and Implementation](https://dibs.pages.dev) course:

- 📘 [Creating a Basic Project with Maven](https://dibs.pages.dev/docs/build-systems/init/maven/)
- 📘 [Structuring a Multi-Module Project with Maven](https://dibs.pages.dev/docs/build-systems/basic-config/maven/)

The goal is to provide a gradual, practical introduction to Maven, starting from project creation and culminating in a clean, modular multi-module build.

## 📚 About the Lessons

- The **first lesson** walks you through installing Maven, using an archetype to create a basic project, and running a simple "Hello, World!" Java app inspired by Pokémon.
- The **second lesson** expands the project into a **multi-module build** using a parent POM and a [Bill of Materials (BOM)](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#dependency-management) to centralize dependency versions.

These lessons are written in Spanish, but the repository uses English for file and code names to maximize accessibility.

## 🧱 Project Structure

```
echo-app-maven/
├── pom.xml            # Parent POM (build configuration and BOM)
├── app/               # Main application logic
│   └── pom.xml
└── lib/               # Reusable library used by `app`
    └── pom.xml
```

- The root `pom.xml` serves as the **parent POM** and declares shared configuration for all modules.
- Modules `app` and `lib` inherit from the parent and are built together.
- A BOM is used to **centralize dependency versions**, so submodules only need to declare the dependencies they use, not their versions.

## 🚀 Getting Started

To build and run the project:

```bash
mvn clean install
mvn -pl app exec:java "-Dexec.mainClass=cl.ravenhill.App"
```

Expected output:

```plaintext
Your journey as a Pokémon Trainer begins now.
Choose wisely: Bulbasaur, Charmander, or Squirtle?
```

## 🧪 Testing (Illustrative Only)

The `lib` and `app` modules don't include real test files, but the parent POM manages a dependency on JUnit:

```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-api</artifactId>
</dependency>
```

This shows how **dependency versions are inherited** from the BOM and don't need to be repeated in each module.

## 🛠 Requirements

- Java 17+ (configured for source/target level 23 if supported)
- Maven 4.0+ (or Maven 3.9.9+ for compatibility)

## 📄 License

This project is licensed under a BSD-style license. See the [LICENSE](./LICENSE) file for full terms.
