package book

fun main() {
    val dish1 = Dish("Salad")
    val dish2 = Dish("Cake")
    val dish3 = Dish("Soup")

    val map1 = mapOf<String, Dish>("dish1" to dish1, "dish2" to dish2, "dish3" to dish3)

    var result = ""
    map1.forEach { (key, value) ->
        result += "$key=${value.title}, "
    }

    println(result.dropLast(2))

    println(map1.containsKey("dish1"))
    println(map1.containsValue(Dish("Cake")))

    println(map1.get("dish1"))
    println(map1["dish1"])
}

data class Dish(val title: String)