package exercise.generics

fun main() {
    val listOfNames = listOf("Nicole", "Iliyan", "Sarah", "Sarah")
    println(countOccurrences(listOfNames, "Sarah")) // 2
    println(countOccurrences(listOfNames, "Yoanna")) // 0

    val emptyList = listOf<Int>()
    println(countOccurrences(emptyList, 5)) // 0
}

/*
Count the number of occurrences of a given element in a List.
The function should work with any type.
If the List is empty or the element is not in the List, return 0.
 */
fun <T> countOccurrences(list: List<T>, element: T): Int {
    var occurrences = 0

    for (item in list) {
        if (item == element) {
            occurrences += 1
        }
    }

    return occurrences
}
