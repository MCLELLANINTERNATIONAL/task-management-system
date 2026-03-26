# Overview

As a software engineer, I am passionate about enhancing my abilities in working with new coding languages. My project builds on my previous TypeScript Task List application by implementing a Kotlin-based task viewer, allowing me to explore how similar concepts can be applied in a different programming language.

The software I have developed is a console-based Kotlin Task Viewer application that allows users to manage tasks by adding, viewing, editing, removing, and searching tasks. The application demonstrates how Kotlin can be used to create structured, readable, and maintainable programs while handling user interaction through a command-line interface.

The purpose of my project was to gain hands-on experience with Kotlin syntax and core programming concepts such as variables, conditionals, loops, functions, and classes. In addition, this project demonstrates the use of collections, data classes, and the `when` keyword to build a complete and functional application.

# Software Demo Video: 

# Development Environment

This software was developed using the following tools:

- IntelliJ IDEA (Community Edition)
- Kotlin (JVM)
- Gradle build system
- Java Development Kit (JDK)

The programming language used in this project is Kotlin, an object-oriented language built on top of Java. Kotlin provides improved readability, concise syntax, and strong type safety compared to traditional Java development.

My project uses Gradle to manage dependencies and build the application. Kotlin’s standard library is used for collections, input handling, and control flow within the application.

# Project Structure

kotlin-task-viewer
│
├── src/
│   └── main/
│       └── kotlin/
│           ├── Main.kt          # Entry point and application flow
│           ├── Task.kt          # Data class representing a task
│           ├── TaskManager.kt   # Core logic for managing tasks
│           └── Menu.kt          # Menu display and user interaction
│
├── build.gradle.kts            # Gradle build configuration
├── settings.gradle.kts         # Project settings
├── .gitignore                  # Files ignored by Git
└── README.md                   # Project documentation

# Useful Websites

- Kotlin Official Documentation: https://kotlinlang.org/docs/home.html
- Kotlin Basic Syntax: https://kotlinlang.org/docs/basic-syntax.html
- Kotlin Collections: https://kotlinlang.org/docs/collections-overview.html
- Kotlin Data Classes: https://kotlinlang.org/docs/data-classes.html
- Kotlin at Light Speed: https://youtu.be/7aLlv87l2O4?si=GQLnbcmaAwaXfYmM
- Full 2025 Kotlin Crash Course For Beginners https://youtu.be/dzUc9vrsldM?si=h5hURUI14ogi9VQi

# Future Work

There are several improvements that could be made to enhance this application:

- Add persistent storage using files or a database
- Improve the user interface with a graphical or mobile-based front end
- Add task sorting and filtering options
- Improve validation and error handling
- Integrate more directly with the TypeScript Task List application

# Run Deom Task viewer in Terminal

## Shortcuts
tms   # root
ts    # TypeScript
kt    # Kotlin

## Run
kt
cd src/main/kotlin
kotlinc *.kt -include-runtime -d app.jar
java -jar app.jar

or

kt
./gradlew run