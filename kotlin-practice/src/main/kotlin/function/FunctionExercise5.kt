package function

fun main() {
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))

    for (item in products.keys) {
        val finalPrice = priceAfterTax(products[item])
        println("$item cost $finalPrice")
    }
}

fun priceAfterTax(price: Double?) = price?.times(1.2)