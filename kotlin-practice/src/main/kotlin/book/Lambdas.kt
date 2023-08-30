package book

fun main() {
    var lambda4: (Double) -> Unit = { println("Hi") }
    lambda4(5.0)

    println(convert(2.5) { it * 2 })
}

fun convert(number: Double, converter: (Double) -> Double): Double {
    return converter(number)
}