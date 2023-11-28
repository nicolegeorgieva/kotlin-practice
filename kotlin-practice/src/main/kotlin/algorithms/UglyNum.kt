package algorithms

fun main() {
    println(isUgly(1)) // true
    println(isUgly(6)) // true
    println(isUgly(8)) // true
    println(isUgly(14)) // false
}

// 8 -> true
private fun isUgly(n: Int): Boolean {
    if (n <= 0) return false

    var num = n
    val primeFactors = listOf(2, 3, 5)

    for (factor in primeFactors) {
        while (num % factor == 0) {
            num /= factor
        }
    }

    return num == 1
}