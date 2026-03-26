/**
 * Represents a single task in the Kotlin Task Viewer.
 *
 * This data class demonstrates the Kotlin data class requirement.
 * It stores structured task data in a clear and concise way.
 */
data class Task(
    val id: Int,
    var title: String,
    var completed: Boolean = false,
    var priority: String = "Medium",
    var dueDate: String? = null
)