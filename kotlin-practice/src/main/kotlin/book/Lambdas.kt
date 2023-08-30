package book

fun main() {
    val lambda4: (Double) -> Unit = { println("Hi") }
    lambda4(5.0)

    println(convert(20.0) { it * 1.8 + 32 })

    convertFive {
        println("Hi")
        it + 5 - 2
    }
}

fun convert(number: Double, converter: (Double) -> Double): Double {
    val res = converter(number)

    println("$number is converted to $res.")
    return res
}

fun convertFive(converter: (Double) -> Double): Double {
    val res = converter(5.0)

    println("5 is converted to $res.")
    return res
}

