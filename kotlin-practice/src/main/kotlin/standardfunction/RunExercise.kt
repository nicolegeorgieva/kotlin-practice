package standardfunction

fun main() {
    val updatedMenu = Restaurant().run {
        standardDish = "salad"
        todaySpecial = "soup"

        printMenu()
        this
    }

    println(updatedMenu)
}

class Restaurant {
    var standardDish = "pizza"
    var todaySpecial = "pasta"

    fun printMenu() {
        println("Menu: $standardDish, $todaySpecial")
    }
}