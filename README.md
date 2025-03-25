# echo-app-maven

A modular Java application managed with Apache Maven. This project demonstrates how to structure a multi-module Maven build, centralize dependency versions using a BOM (Bill of Materials), and apply best practices for maintainability and reuse.

## 🧱 Project Structure

This project uses a classic multi-module layout:

```
echo-app-maven/
├── pom.xml            # Parent POM (build configuration and BOM)
├── app/               # Main application logic
│   └── pom.xml
└── lib/               # Reusable library used by `app`
    └── pom.xml
```

- The root `pom.xml` serves as the **Maven parent POM**.
- Modules `app` and `lib` are declared as `<modules>` and inherit from the parent.
- A BOM is used to centralize dependency versions (e.g. for JUnit).

## 🚀 Getting Started

To build the project:

```bash
mvn clean install
```

This command will:

- Compile and install the `lib` module first
- Then compile the `app` module
- Ensure consistent dependency versions across all modules

## 🧪 Testing (Illustrative Only)

Although the project does not include actual test code, the dependency on `junit-jupiter` is declared in the BOM to demonstrate how **centralized dependency management** works in Maven multi-module projects.

Submodules can reference this dependency without repeating the version:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
</dependency>
```

This is resolved to the version specified in the root `pom.xml`.

## 📄 License

This project is licensed under a BSD-style license. See the [LICENSE](./LICENSE) file for full terms.

## 🛠 Requirements

- Java 17+ (configured for source/target level 23 if supported)
- Maven 4.0+