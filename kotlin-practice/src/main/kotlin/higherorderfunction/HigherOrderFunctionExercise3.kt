package higherorderfunction

fun main() {
    val integers = listOf(203, 410, 697)
    println(integers.maxBy { it / 10 % 10 })
}