package forloop

fun main() {
    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))

    //key
    for (customerName in customers.keys) {
        val purchasesCount = customers[customerName] //will get the value associated with this key
        println("Hello, $customerName! You've made $purchasesCount purchases.")
    }
}
