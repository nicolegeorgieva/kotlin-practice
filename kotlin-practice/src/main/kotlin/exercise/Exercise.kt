package exercise

fun main() {
    val names = listOf("Alice", "Bob", "Charlie", "David")

    val sortedByNameLength = names.sortedBy { it.length }
    println(sortedByNameLength)

    val sortedByNameLengthDescending = names.sortedByDescending { it.length }
    println(sortedByNameLengthDescending)
}

