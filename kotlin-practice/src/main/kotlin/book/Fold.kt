package book

fun main() {
    val newList = listOf(1, 2, 3, 4, 5)

    val sumOfNums = newList.fold(0) { a, b -> a + b }
    println(sumOfNums)
}