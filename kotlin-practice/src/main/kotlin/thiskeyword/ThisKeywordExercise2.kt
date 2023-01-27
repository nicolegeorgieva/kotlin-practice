package thiskeyword

fun main() {
    val customTable = Table()
    customTable.printInfo()

    customTable.updateDimensions(100, 70)
    customTable.printInfo()
}

class Table {
    var height = 80
    var width = 60

    fun updateDimensions(height: Int, width: Int) {
        this.height = height
        this.width = width
    }

    fun printInfo() {
        println("Table height: ${height}, table width: ${width}")
    }
}