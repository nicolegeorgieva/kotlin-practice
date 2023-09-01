package book

fun main() {
    val totalCost = groceries.filter { it.category == "Vegetable" }.fold(0.0) { cost, grocery ->
        cost + (grocery.quantity * grocery.unitPrice)
    }
    println(totalCost)

    val groceryList = groceries.filter { (it.unitPrice * it.quantity) < 5.0 }.map { it.name }
    println(groceryList)

    val totalCostOfCategory = groceries.groupBy { it.category }.forEach {
        println("${it.key}: ${it.value.sumByDouble { it.unitPrice * it.quantity }}")
    }

    val someOrder = groceries.filter { it.unit != "Bottle" }.groupBy { it.unit }.forEach {
        println("${it.key}: ${it.value.map { it.name }}")
    }
}

data class Grocery2(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)

val groceries = listOf(
    Grocery2("Tomatoes", "Vegetable", "lb", 3.0, 3),

    Grocery2("Mushrooms", "Vegetable", "lb", 4.0, 1),

    Grocery2("Bagels", "Bakery", "Pack", 1.5, 2),

    Grocery2("Olive oil", "Pantry", "Bottle", 6.0, 1),

    Grocery2("Ice cream", "Frozen", "Pack", 3.0, 2)
)