package exercise

fun main() {
    println(fibonacci(10))
}

//fib(1) = 1
//fib(2) = 1
//fib(n) =  fib(n - 1) + fib(n - 2)

fun fibonacci(n: Int): Int {
    return when {
        n <= 0 -> 0
        n == 1 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}