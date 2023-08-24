package book

fun main() {
    val dish1 = Dish("Salad")
    val dish2 = Dish("Cake")
    val dish3 = Dish("Soup")

    val map1 = mutableMapOf<String, Dish>("dish1" to dish1, "dish2" to dish2, "dish3" to dish3)

    var result = ""
    map1.forEach { (key, value) ->
        result += "$key=${value.title}, "
    }

    println(result.dropLast(2))

    println(map1.containsKey("dish1"))
    println(map1.containsValue(Dish("Cake")))

    println(map1.get("dish1"))
    println(map1["dish1"])

    map1.put("dish4", dish3)
    println(map1)

    println(map1.put("dish4", dish2))
    println(map1)

    map1.clear()
    println(map1)
}

data class Dish(val title: String)