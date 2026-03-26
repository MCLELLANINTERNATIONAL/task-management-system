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
    val appName = "Kotlin Task Viewer"   // immutable variable
    var running = true                   // mutable variable

    val manager = TaskManager()
    manager.loadSampleTasks()

    println("Welcome to $appName")

    while (running) {
        showMenu()
        print("Select an option: ")

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

                manager.addTask(title, priority)
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
                print("Enter task ID to remove: ")
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

                    manager.editTask(id, newTitle, newPriority)
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
                println("Exiting program.")
                running = false
            }

            else -> {
                println("Invalid option. Please select a number from 1 to 8.")
            }
        }
    }
}