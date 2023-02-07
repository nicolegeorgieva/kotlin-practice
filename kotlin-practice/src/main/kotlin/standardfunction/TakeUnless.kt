package standardfunction

fun main() {
    val numbers = mutableListOf<Int>()
    println("Please input 10 numbers")

    for (i in 1..10) {
        val number = readln().toInt()

        number.takeIf { it % 2 != 0 }  //we want only odd numbers unless they're "3" or "13"
            .takeUnless { it == 3 || it == 13 }
            ?.let { numbers.add(it) }
    }

    println(numbers)
}