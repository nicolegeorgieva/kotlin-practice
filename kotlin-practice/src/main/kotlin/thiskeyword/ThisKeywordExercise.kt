package thiskeyword

fun main() {
    val box = Box()
    println("Contents are ${box.contents}.")
    box.updateContents("books")
    println("Contents are ${box.contents}.")
}

class Box {
    var contents: String = ""

    fun updateContents(contents: String) {
        this.contents = contents
    }
}