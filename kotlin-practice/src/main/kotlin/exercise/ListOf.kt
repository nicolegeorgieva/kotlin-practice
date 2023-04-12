package exercise

import kotlin.math.max
import kotlin.math.min

fun main() {
    val list = listOf<Int>(5, 6, 12, 21, 45).shuffled()

    println(secondLargest(list))
}

fun secondLargest(numbers: List<Int>): Int {
    var maxInt = max(numbers[0], numbers[1])
    var secondMaxInt = min(numbers[0], numbers[1])

    for (i in 2 until numbers.size) {
        if (numbers[i] > maxInt) {
            secondMaxInt = maxInt
            maxInt = numbers[i]
        } else if (numbers[i] > secondMaxInt && numbers[i] != maxInt) {
            secondMaxInt = numbers[i]
        }
    }

    return secondMaxInt
}