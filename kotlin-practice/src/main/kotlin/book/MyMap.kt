package book

fun main() {
    val myMap = mapOf("A" to 4, "B" to 3, "C" to 2, "D" to 1, "E" to 2)
    var x1 = ""
    var x2 = 0

    x1 = myMap.keys.fold("") { x, y -> x + y }
    x2 = myMap.entries.fold(0) { x, y -> x * y.value }

    println("$x1$x2")
}



