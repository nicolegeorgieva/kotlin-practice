package book

fun main() {
    val y = { x: Int ->
        x + 5
        "last line"
    }

    println(y(5))
}

