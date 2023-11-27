package algorithms

fun main() {
    println(isUgly(1))
    println(isUgly(6))
    println(isUgly(8))
    println(isUgly(14))
}

// 8 -> true
private fun isUgly(n: Int): Boolean {
    val primeFactors = listOf(2, 3, 5)

    if (n == 1) return true

    var primeNum = 0
    if (n % 2 == 0) { // 8
        do {
            primeNum = n / 2
        } while ((primeNum / 2) % 2 != 0)
    }

    if (primeNum != 0 && primeNum !in primeFactors) {
        return false
    }

    return true
}