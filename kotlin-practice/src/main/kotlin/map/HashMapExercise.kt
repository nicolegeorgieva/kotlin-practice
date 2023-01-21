package map

fun main() {
    val count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))

    println(count.getValue(2))
    println(count.getValue(3))

    count[4] = "quatre"
    println(count)
}