package exercise

fun main() {
    println(sumN(-2))
}

// sum of integers from 1 to N (n = 2, 1 + 2 = 3)
fun sumN(n: Int): Int {
    return when {
        n <= 0 -> 0
        n == 1 -> 1
        else -> sumN(n - 1) + n
    }
}