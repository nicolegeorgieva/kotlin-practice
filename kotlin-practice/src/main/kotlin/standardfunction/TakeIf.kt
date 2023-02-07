package standardfunction

fun main() {
    val numbers = listOf(3, 67, 85, 94, 8, 99, 30, 22, 89)
    println(numbers)

    val newNumbers = arrayListOf<Int>()
    for (number in numbers) {
        number.takeIf { it % 2 == 0 } //takes the number if it's even
            ?.let { newNumbers.add(it) }
    }

    println(newNumbers)
}

