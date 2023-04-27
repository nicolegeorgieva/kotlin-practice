package exercise.generics

fun main() {
    val (a, b) = swap(1, 2)
    println("a: $a, b: $b") // should print "a: 2, b: 1"

    val (x, y) = swap("Hello", "World")
    println("x: $x, y: $y") // should print "x: World, y: Hello"
}

fun <T> swap(a: T, b: T): Pair<T, T> {
    return Pair(b, a)
}