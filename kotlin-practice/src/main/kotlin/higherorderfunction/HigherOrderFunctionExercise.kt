package higherorderfunction

fun main() {
    val integers = setOf(52, 21, 6, 11, 304)
    println(integers.filter { it in 10..99 })
}