# Kotlin Task Viewer

This folder contains the Kotlin application used for the Kotlin language module.

The Kotlin Project README submission is at the repository root:

- `../README.md`

Direct grading and run instructions are at:

- `../GRADING-INSTRUCTIONS.md`

## Run Locally

From this folder, run:

```bash
./gradlew run --console=plain
```

Optional verification:

```bash
./gradlew test
```

## Source Files

- `src/main/kotlin/Main.kt` - CLI entry point and menu flow
- `src/main/kotlin/Menu.kt` - menu display
- `src/main/kotlin/Task.kt` - task data class
- `src/main/kotlin/TaskManager.kt` - task operations and business logic