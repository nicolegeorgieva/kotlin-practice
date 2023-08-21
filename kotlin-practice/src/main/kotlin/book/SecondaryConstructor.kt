package book

fun main() {
    val book1 = Book(pagesParam = 23)
    println("${book1.genre}, ${book1.pages}")
}

class Book(val genre: String, val pages: Int) {
    constructor(pagesParam: Int) : this("Sci-fi", pagesParam)
}