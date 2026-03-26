/**
 * Manages the task collection and provides methods
 * for adding, removing, updating, and displaying tasks.
 *
 * This class demonstrates the Kotlin class requirement.
 */
class TaskManager {

    /**
     * A mutable collection of tasks.
     * This demonstrates creation and modification of collections.
     */
    private val tasks = mutableListOf<Task>()

    /**
     * Tracks the next available task ID.
     * This demonstrates a mutable variable.
     */
    private var nextId = 1

    /**
     * Seeds the application with starter tasks so the viewer has
     * content when it first runs.
     */
    fun loadSampleTasks() {
        if (tasks.isEmpty()) {
            addTask("Review TypeScript task list architecture", "High", "2026-03-30")
            addTask("Plan Kotlin task viewer structure", "High", "2026-04-02")
            addTask("Record Kotlin demo video", "Medium", "2026-04-05")
        }
    }

    /**
     * Adds a new task to the collection.
     *
     * @param title The title of the task.
     * @param priority The priority of the task.
     * @param dueDate The optional due date of the task.
     */
    fun addTask(title: String, priority: String = "Medium", dueDate: String? = null) {
        if (title.isBlank()) {
            println("Task title cannot be empty.")
            return
        }

        val normalizedPriority = normalizePriority(priority)

        val task = Task(
            id = nextId++,
            title = title.trim(),
            completed = false,
            priority = normalizedPriority,
            dueDate = dueDate?.trim()?.takeIf { it.isNotBlank() }
        )

        tasks.add(task)
        println("Task added: ${task.title}")
    }

    /**
     * Displays all tasks in the collection.
     * This demonstrates loops, expressions, and conditionals.
     */
    fun displayTasks() {
        if (tasks.isEmpty()) {
            println("No tasks available.")
            return
        }

        println("\nTask List:")
        for (task in tasks) {
            val status = if (task.completed) "[x]" else "[ ]"
            val dueText = if (task.dueDate != null) " | Due: ${task.dueDate}" else ""
            println("${task.id}. $status ${task.title} (${task.priority})$dueText")
        }
    }

    /**
     * Toggles the completion status of a task by ID.
     *
     * @param id The ID of the task to toggle.
     */
    fun toggleTask(id: Int) {
        val task = tasks.find { it.id == id }

        if (task != null) {
            task.completed = !task.completed
            val resultMessage = if (task.completed) {
                "Task marked complete."
            } else {
                "Task marked incomplete."
            }
            println(resultMessage)
        } else {
            println("Task not found.")
        }
    }

    /**
     * Removes a task by ID.
     *
     * @param id The ID of the task to remove.
     */
    fun removeTask(id: Int) {
        val removed = tasks.removeIf { it.id == id }

        if (removed) {
            println("Task removed.")
        } else {
            println("Task not found.")
        }
    }

    /**
     * Edits the title, priority, and due date of a task.
     *
     * @param id The ID of the task to edit.
     * @param newTitle The new task title.
     * @param newPriority The new task priority.
     * @param newDueDate The new optional due date.
     */
    fun editTask(id: Int, newTitle: String, newPriority: String, newDueDate: String? = null) {
        val task = tasks.find { it.id == id }

        if (task == null) {
            println("Task not found.")
            return
        }

        if (newTitle.isBlank()) {
            println("New task title cannot be empty.")
            return
        }

        task.title = newTitle.trim()
        task.priority = normalizePriority(newPriority)
        task.dueDate = newDueDate?.trim()?.takeIf { it.isNotBlank() }

        println("Task updated.")
    }

    /**
     * Displays task statistics.
     * This demonstrates expressions and collection operations.
     */
    fun showStatistics() {
        val totalTasks = tasks.size
        val completedTasks = tasks.count { it.completed }
        val activeTasks = totalTasks - completedTasks

        println("\nTask Statistics:")
        println("Total tasks: $totalTasks")
        println("Completed tasks: $completedTasks")
        println("Active tasks: $activeTasks")
    }

    /**
     * Searches tasks by keyword in the title.
     *
     * @param keyword The word or phrase to search for.
     */
    fun searchTasks(keyword: String) {
        val results = tasks.filter { it.title.contains(keyword, ignoreCase = true) }

        if (results.isEmpty()) {
            println("No matching tasks found.")
            return
        }

        println("\nSearch Results:")
        for (task in results) {
            val status = if (task.completed) "[x]" else "[ ]"
            val dueText = if (task.dueDate != null) " | Due: ${task.dueDate}" else ""
            println("${task.id}. $status ${task.title} (${task.priority})$dueText")
        }
    }

    /**
     * Returns true if there are tasks in the list.
     */
    fun hasTasks(): Boolean {
        return tasks.isNotEmpty()
    }

    /**
     * Normalizes priority values to a small accepted set.
     *
     * This demonstrates conditional logic.
     */
    private fun normalizePriority(priority: String): String {
        return when (priority.trim().lowercase()) {
            "low" -> "Low"
            "medium" -> "Medium"
            "high" -> "High"
            else -> "Medium"
        }
    }
}