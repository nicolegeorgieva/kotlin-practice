package exercise

fun main() {
    try {
        print(factorial(-10))
    } catch (e: IllegalArgumentException) {
        println("n should be a positive number greater than 0.")
    }
}

fun factorial(n: Int): Int {
    return if (n <= 0) {
        throw IllegalArgumentException("n should be a positive number greater than 0.")
    } else if (n == 1) {
        1
    } else
        factorial(n - 1) * n
}