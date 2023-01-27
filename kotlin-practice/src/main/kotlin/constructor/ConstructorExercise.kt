package constructor

fun main() {
    val table = Table()
    println(table.legs)
    println(table.height)

    val table2 = Table(90)
    println(table2.legs)
    println(table2.height)

    val table3 = Table(3, 105)
    println(table3.legs)
    println(table3.height)
}

class Table {
    var legs: Int
    var height: Int

    constructor() {
        legs = 4
        height = 70
    }

    constructor(newHeight: Int) {
        legs = 4
        height = newHeight
    }

    constructor(newLegsCount: Int, newHeight: Int) {
        legs = newLegsCount
        height = newHeight
    }
}