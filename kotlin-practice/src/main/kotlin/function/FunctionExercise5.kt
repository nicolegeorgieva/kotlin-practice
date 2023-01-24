package function

fun main() {
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))

//    for (key in products.keys) {
//        val finalPrice = priceAfterTax(products[key])
//        println("$key cost $finalPrice")
//    }

    for ((key, value) in products) {
        val finalPrice = priceAfterTax(value)
        println("$key cost $finalPrice")
    }
}

fun priceAfterTax(price: Double) = price * 1.2