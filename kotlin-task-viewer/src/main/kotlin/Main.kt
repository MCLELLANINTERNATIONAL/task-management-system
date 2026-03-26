/**
 * Entry point for the Kotlin Task Viewer application.
 *
 * This file demonstrates:
 * - mutable and immutable variables
 * - loops
 * - conditionals
 * - expressions
 * - functions
 * - use of the when keyword
 */
fun main() {
    val appName = "Kotlin Task Viewer"
    var running = true

    var manager = TaskManager()
    manager.loadSampleTasks()

    println("Welcome to $appName")

    while (running) {
        showMenu()
        print("Choose an option (1-9): ")

        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> {
                manager.displayTasks()
            }

            2 -> {
                print("Enter task title: ")
                val title = readLine() ?: ""

                print("Enter priority (Low, Medium, High): ")
                val priority = readLine() ?: "Medium"

                print("Enter due date (YYYY-MM-DD) or leave blank: ")
                val dueDate = readLine()?.takeIf { it.isNotBlank() }

                manager.addTask(title, priority, dueDate)
            }

            3 -> {
                print("Enter task ID to toggle: ")
                val id = readLine()?.toIntOrNull()

                if (id != null) {
                    manager.toggleTask(id)
                } else {
                    println("Invalid task ID.")
                }
            }

            4 -> {
                print("Enter task ID to delete: ")
                val id = readLine()?.toIntOrNull()

                if (id != null) {
                    manager.removeTask(id)
                } else {
                    println("Invalid task ID.")
                }
            }

            5 -> {
                print("Enter task ID to edit: ")
                val id = readLine()?.toIntOrNull()

                if (id != null) {
                    print("Enter new task title: ")
                    val newTitle = readLine() ?: ""

                    print("Enter new priority (Low, Medium, High): ")
                    val newPriority = readLine() ?: "Medium"

                    print("Enter new due date (YYYY-MM-DD) or leave blank: ")
                    val newDueDate = readLine()?.takeIf { it.isNotBlank() }

                    manager.editTask(id, newTitle, newPriority, newDueDate)
                } else {
                    println("Invalid task ID.")
                }
            }

            6 -> {
                manager.showStatistics()
            }

            7 -> {
                print("Enter search keyword: ")
                val keyword = readLine() ?: ""
                manager.searchTasks(keyword)
            }

            8 -> {
                manager = TaskManager()
                manager.loadSampleTasks()
                println("Task list reset to sample tasks.")
            }

            9 -> {
                println("Exiting program.")
                running = false
            }

            else -> {
                println("Invalid option. Please choose a number from 1 to 9.")
            }
        }
    }
}