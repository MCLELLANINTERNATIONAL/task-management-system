# Overview

As a software engineer, I want to strengthen my ability to learn new programming languages by rebuilding familiar software in a different language and environment. This project demonstrates that goal by implementing a console-based task manager in Kotlin.

The software I wrote is a Kotlin Task Viewer that allows a user to add, list, edit, delete, search, and complete tasks from the command line. Each task stores an id, title, completion status, priority, and optional due date. The program demonstrates Kotlin syntax and core programming concepts through a complete working application.

The purpose of writing this software was to gain hands-on experience with Kotlin while applying variables, expressions, conditionals, loops, functions, classes, collections, data classes, and the `when` keyword in a practical project.

The Kotlin module that should be graded is located in `kotlin-task-viewer/`. The `typescript-tasklist/` folder contains earlier related work and is not required to run the Kotlin application for this assignment.

# Software Demo Video

Video 1: Code and requirement walkthrough - https://www.loom.com/share/0170567f99ea4287871a9e65f609927b (2min23)
Video 2: Functionality demonstration - https://www.loom.com/share/818c1531134040e0bae8e8c4ccb880ef (2m4s)

# Project Structure

task-management-system/
│
├── kotlin-task-viewer/              # Module 2 (Kotlin project)
│   ├── src/
│   │   └── main/
│   │       └── kotlin/
│   │           ├── Main.kt
│   │           ├── Menu.kt
│   │           ├── Task.kt
│   │           └── TaskManager.kt
│   │
│   ├── build/                      # Gradle output (generated)
│   ├── .gradle/                    # Gradle cache (generated)
│   ├── bin/                        # compiled artifacts (optional)
│   ├── gradle/
│   │   └── wrapper/
│   │       ├── gradle-wrapper.jar
│   │       └── gradle-wrapper.properties
│
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   ├── gradlew
│   ├── gradlew.bat
│   ├── .gitignore
│   └── README.md
│
├── typescript-tasklist/            # Module 1 (TypeScript project)
│   ├── data/
│   │   └── tasks.json
│   │
│   ├── src/
│   │   ├── cli.ts
│   │   ├── interactive.ts
│   │   ├── taskManager.ts
│   │   ├── storage.ts
│   │   ├── sampleData.ts
│   │   ├── types.ts
│   │   ├── utils.ts
│   │   ├── errors.ts
│   │   ├── web.ts
│   │   └── styles.css
│   │
│   ├── dist/                      # compiled JS (generated)
│   ├── web-dist/                  # browser build (generated)
│   ├── node_modules/              # dependencies
│
│   ├── index.html
│   ├── package.json
│   ├── package-lock.json
│   ├── tsconfig.json
│   ├── vite.config.ts
│   ├── .gitignore
│   └── README.md

# Development Environment

This software was developed using:

- IntelliJ IDEA Community Edition
- Visual Studio Code
- Kotlin (JVM)
- Gradle Wrapper
- Java Development Kit (JDK 21)

The programming language used in this project is Kotlin. The application uses the Kotlin standard library and is built with Gradle using the Application plugin so that the program can be run from the command line with the included Gradle wrapper.

Run instructions for graders are provided in `GRADING-INSTRUCTIONS.md`.

# Useful Websites

- [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Basic Syntax](https://kotlinlang.org/docs/basic-syntax.html)
- [Kotlin Collections Overview](https://kotlinlang.org/docs/collections-overview.html)
- [Kotlin Data Classes](https://kotlinlang.org/docs/data-classes.html)
- [Comparison to Java](https://kotlinlang.org/docs/comparison-to-java.html)

# Future Work

- Add persistent storage so tasks remain after the program closes
- Validate due dates before saving them
- Add sorting and filtering options
- Add automated tests for task operations
- Build a graphical front end that reuses the task logic
