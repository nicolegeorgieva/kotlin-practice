package lambdafunction

fun main() {
    val numbers = arrayListOf(10, 20, 30)
    val lambda = { number: Int -> number / 10 }
    println(test(numbers, lambda))
}

fun test(numbers: ArrayList<Int>, action: (Int) -> Int): ArrayList<Int> {
    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 0) {
            numbers[i] = action(numbers[i])
        }
    }

    return numbers
}