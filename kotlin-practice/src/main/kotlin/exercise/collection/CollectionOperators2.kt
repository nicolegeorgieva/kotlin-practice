package exercise.collection

fun main() {
    val salesData = listOf<Sale>(
        Sale("Meat", 7.0, 10),
        Sale("Fish", 5.0, 5),
        Sale("Snack", 3.0, 2),
        Sale("Bread", 1.0, 5),
        Sale("Nuts", 2.0, 9),
        Sale("Chocolate", 3.0, 5)
    )

    println(calculateTotalProfit(salesData, 1.0))
}

/*
You are given a list of sales data represented as objects with the following
properties: productName (String), price (Double), and quantitySold (Int).
Your task is to create a Kotlin program that performs various operations on the list using collection operators.
 */

data class Sale(
    val productName: String,
    val price: Double,
    val quantitySold: Int
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
    return salesData.filter { it.price in minPrice..maxPrice }
        .sortedByDescending { it.price }
        .map { "${it.productName}: ${it.price}" }
}

fun findTopNSellingProducts(salesData: List<Sale>, topN: Int): List<String> {
    return salesData.sortedByDescending { it.quantitySold }
        .take(topN)
        .map { "${it.productName}: ${it.quantitySold} sold" }
}

enum class PriceCategory {
    Low,
    Medium,
    High
}

data class SaleWithProfit(
    val saleData: Sale,
    val profit: Double
)

fun calculatePriceCategory(price: Double): PriceCategory {
    return when (price) {
        in 0.0..2.0 -> PriceCategory.Low
        in 2.01..3.0 -> PriceCategory.Medium
        else -> PriceCategory.High
    }
}

fun groupByPriceCategory(salesData: List<Sale>): Map<PriceCategory, List<Sale>> {
    return salesData.groupBy { calculatePriceCategory(it.price) }
}

fun calculateTotalProfit(salesData: List<Sale>, fixedCostPerProduct: Double): List<String> {
    return salesData.map {
        SaleWithProfit(saleData = it, profit = (it.price * it.quantitySold) - (fixedCostPerProduct * it.quantitySold))
    }
        .map {
            "${it.saleData.productName} - ${it.profit} profit"
        }
}