# Grader Instructions

This repository contains two folders, but the Kotlin assignment to grade is:

- `kotlin-task-viewer/`

The `typescript-tasklist/` folder is earlier related work and is not required for the Kotlin module.

## How To Run The Kotlin Project

1. Open a terminal in the repository root.
2. Change into the Kotlin project folder:

```bash
cd kotlin-task-viewer
```

3. Run the application with the included Gradle wrapper:

```bash
./gradlew run --console=plain
```

On first run, Gradle may download dependencies automatically.

## Optional Verification

To verify that the project builds successfully:

```bash
cd kotlin-task-viewer
./gradlew test
```

This project does not currently include automated unit tests, so the `test` task mainly verifies configuration and compilation.

## What The App Does

The Kotlin Task Viewer is a console application that allows a user to:

- list tasks
- add tasks
- edit tasks
- delete tasks
- toggle task completion
- search tasks
- view task statistics
- reset the list to sample tasks

When the app starts, it loads sample tasks so the menu can be demonstrated immediately.
