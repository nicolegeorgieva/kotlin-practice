package book

fun main() {
    val y = { x: Int ->
        x + 5
        "last line"
    }

    println(y(5))

    val a = { a: Int, z: Int -> a + z }
    println(a(3, 2))

    val b = { "Pow" }
    println(b())

    val add: (x: Int, y: Int) -> Int = { x: Int, y: Int -> x + y }
    println(add(2, 2))
}

