package book

fun main() {
    val myMap = mapOf(Pair("a", 1), Pair("b", 2))

    println(myMap.values.sum())
    println(myMap.keys.size)


    val groceries2 = listOf(
        Grocery("Tomatoes", "Vegetables", "lb", 5.2),
        Grocery(
            "Mushrooms", "Vegetables", "lb", 4.0
        )
    )

    val groceryNames = groceries2.map { it.name }
    println(groceryNames)
}