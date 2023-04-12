package exercise

fun main() {
    try {
        print(factorial(5))
    } catch (e: IllegalArgumentException) {
        println("n should be a positive number greater than 0.")
    }
}

// factorial(1) -> 1
// factorial(2) -> factorial(2 - 1) * 2 = 1 * 2 = 2
// factorial(3) -> factorial(3 - 1) * 3 = 2 * 3 = 6
// factorial(4) -> factorial(4 - 1) * 4 = 6 * 4 = 24
// factorial(5) -> factorial(5 - 1) * 5 = 24 * 5 = 120

fun factorial(n: Int): Int {
    return if (n <= 0) {
        throw IllegalArgumentException("n should be a positive number greater than 0.")
    } else if (n == 1) {
        1
    } else
        factorial(n - 1) * n
}