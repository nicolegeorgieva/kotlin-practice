package generics

fun main() {
    val collection1 = Information<List<String>>()
    collection1.iterate(listOf("book", "pc", "ps5"))
}


class Information<T : Collection<String>> {
    fun iterate(items: T) {
        items.forEach {
            println(it)
        }
    }
}