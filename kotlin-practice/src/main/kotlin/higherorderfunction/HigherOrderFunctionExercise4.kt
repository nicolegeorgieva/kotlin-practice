package higherorderfunction

fun main() {
    val integers = listOf(1, 105, 24, 33, 9, 204, 40)
    val result = integers.map {
        if (it % 2 == 0) {
            it / 2
        } else {
            it * 2
        }
    }.filter { it > 25 }

    println(result)
}