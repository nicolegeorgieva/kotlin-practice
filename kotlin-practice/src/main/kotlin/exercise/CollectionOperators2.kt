package exercise

fun main() {
    val salesData = listOf<Sale>(
        Sale("Meat", 7.0, 10),
        Sale("Fish", 5.0, 5),
        Sale("Snack", 3.0, 2),
        Sale("Bread", 1.0, 5),
        Sale("Nuts", 2.0, 9),
        Sale("Chocolate", 3.0, 5)
    )

    println(findTopNSellingProducts(salesData, 3))
}

/*
You are given a list of sales data represented as objects with the following
properties: productName (String), price (Double), and quantitySold (Int).
Your task is to create a Kotlin program that performs various operations on the list using collection operators.
 */

data class Sale(
    val productName: String, val price: Double, val quantitySold: Int
)

fun calculateTotalRevenue(salesData: List<Sale>): Double {
    return salesData.sumOf { it.price * it.quantitySold }
}

fun findMostSoldProduct(salesData: List<Sale>): String {
    return try {
        salesData.maxBy { it.quantitySold }.productName
    } catch (e: Exception) {
        "Invalid data"
    }
}

fun filterSalesByPriceRange(salesData: List<Sale>, minPrice: Double, maxPrice: Double): List<String> {
    return salesData.filter { it.price in minPrice..maxPrice }.sortedByDescending { it.price }
        .map { "${it.productName}: ${it.price}" }
}

fun findTopNSellingProducts(salesData: List<Sale>, topN: Int): List<String> {
    return salesData.sortedByDescending { it.quantitySold }
        .take(topN)
        .map { "${it.productName}: ${it.quantitySold} sold" }
}
