package book

fun main() {
    for (i in array) {
        i?.let {
            println(i)
        }
    }
}

val array = listOf(null, "txt")