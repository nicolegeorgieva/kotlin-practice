package standardfunction

fun main() {
    Restaurant().run {
        standardDish = "salad"
        todaySpecial = "soup"

        printMenu()
    }
}

class Restaurant {
    var standardDish = "pizza"
    var todaySpecial = "pasta"

    fun printMenu() {
        println("Menu: $standardDish, $todaySpecial")
    }
}