package book

fun main() {
    val r = Recipe("Salad", true)

    val title1 = r.title
    val veg = r.isVegetarian

    val (title, isVegetarian) = r
    println(title)
}

data class Recipe(val title: String, val isVegetarian: Boolean)