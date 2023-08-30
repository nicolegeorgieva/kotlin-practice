package book

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetables", "lb", 5.2),
        Grocery(
            "Mushrooms", "Vegetables", "lb", 4.0
        )
    )

    println("Expensive ingredients:")
    println(search(groceries) { i: Grocery -> i.unitPrice > 5.0 })
    println("All vegetables:")
    println(search(groceries) { i: Grocery -> i.category == "Vegetables" })
}

data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double)

fun search(g: List<Grocery>, criteria: (Grocery) -> Boolean): List<String> {
    val res = mutableListOf<String>()

    for (grocery in g) {
        if (criteria(grocery)) res.add(grocery.name)
    }

    return res
}
