package exercise

fun main() {
    println(sumN(5))
}

// sumN(1) = 1
// sumN(2) = 3
// sumN(3) = sumN(3 - 1) + 3 = sumN(2) + 3 = 3 + 3 = 6
// sumN(4) = sumN(4 - 1) + 4 = 6 + 4 = 10
// sumN(5) = sumN(5 - 1) + 5 = 10 + 5 = 15

// sum of integers from 1 to N (n = 2, 1 + 2 = 3)
fun sumN(n: Int): Int {
    return when {
        n <= 0 -> 0
        n == 1 -> 1
        else -> sumN(n - 1) + n
    }
}