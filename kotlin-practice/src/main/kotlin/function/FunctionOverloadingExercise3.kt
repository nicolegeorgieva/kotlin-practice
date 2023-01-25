package function

fun main() {
    priceAfterTax("bread", 1.60)
    priceAfterTax(mapOf(Pair("cheese", 4.6), Pair("butter", 2.8), Pair("milk", 2.6)))
}

fun priceAfterTax(productsAndPrices: Map<String, Double>) {
    for ((products, prices) in productsAndPrices) {
        priceAfterTax(products, prices)
    }
}

fun priceAfterTax(product: String, price: Double) {
    println("The product '$product' will cost ${price * 1.2} after tax.")
}

