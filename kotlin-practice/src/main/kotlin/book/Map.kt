package book

fun main() {
    val myMap = mapOf(Pair("a", 1), Pair("b", 2))

    println(myMap.values.sum())
    println(myMap.keys.size)
}