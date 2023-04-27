package exercise.generics

fun main() {
    val intList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val emptyList = listOf<Int>()
    val middle = middle(intList)

    println(middle)
    println(middle(emptyList))
}

// Return the middle element of the list, or null if the list is empty
// If the List has an even number of elements, return the element before the midpoint.
fun <T> middle(list: List<T>): T? {
    if (list.isEmpty()) return null

    return list[(list.size - 1) / 2]
}

