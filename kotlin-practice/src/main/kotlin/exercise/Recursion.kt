package exercise

fun main() {
    println(factorial(5))
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        1
    } else
        factorial(n - 1) * n
}