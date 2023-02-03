package standardfunction

fun main() {
    with(Store()) {
        shoes = 120
        shirts = 87
        jackets = 102

        printInventory()
    }
}

class Store {
    var shoes = 200
    var shirts = 150
    var jackets = 95

    fun printInventory() {
        println("shoes: $shoes, shirts: $shirts, jackets: $jackets")
    }
}