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

    val list = listOf("ads", "sfs", "dofds", null)
    val newList = list.mapNotNull {
        if (it == "dofds") null else it?.uppercase()
    }
    println(newList)
}