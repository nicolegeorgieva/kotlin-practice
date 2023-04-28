package practice.exercise

fun main() {
    val nums = intArrayOf(3, 2, 3)
    println(majorityElement(nums))
}

fun majorityElement(numbers: IntArray): Int = numbers
    .groupBy { it }
    .mapValues { it.value.size }
    .maxBy { it.value }.key