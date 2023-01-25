package vararg

fun main() {
    println(sumOfIntegers(5, 1, 3, 1))
    println(sumOfIntegers(1, 5, 6))
}

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }

    return sum
}