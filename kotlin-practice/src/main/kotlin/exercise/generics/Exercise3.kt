package exercise.generics

fun main() {
    val newList = listOf(1, 2, 3, 5, 3)
    val lastIndex = lastIndexOf(newList, 3)

    println(lastIndex) // should print 4

    val numbers = listOf(1, 2, 3, 2, 1)
    println(lastIndexOf(numbers, 2)) // should print 3

    val names = listOf("Alice", "Bob", "Charlie", "Alice")
    println(lastIndexOf(names, "Alice")) // should print 3

    val emptyList = listOf<Int>()
    println(lastIndexOf(emptyList, 1)) // should print -1
}

// Return the index of the last occurrence of the element in the list, or -1 if not found
fun <T> lastIndexOf(list: List<T>, element: T): Int {
    var resIndex = -1

    for (i in list.indices) {
        if (list[i] == element) {
            resIndex = i
        }
    }

    return resIndex
}
