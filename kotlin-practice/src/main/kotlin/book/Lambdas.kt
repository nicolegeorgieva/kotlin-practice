package book

fun main() {
    var lambda4: (Double) -> Unit = { println("Hi") }
    lambda4(5.0)

    println(convert(20.0) { it * 1.8 + 32 })
}

fun convert(number: Double, converter: (Double) -> Double): Double {
    val res = converter(number)

    println("$number is converted to $res.")
    return res
}

