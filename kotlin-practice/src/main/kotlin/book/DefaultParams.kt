package book

fun main() {
    test()
}

fun test(text: String = "Text", pages: Int = 23) {
    println("$text with $pages pages.")
}