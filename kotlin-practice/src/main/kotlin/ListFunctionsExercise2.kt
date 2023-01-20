fun main() {
    val recipeIngredients = arrayListOf("chicken", "egg", "mozzarella", "pepper")

    recipeIngredients[recipeIngredients.indexOf("mozzarella")] = "blue cheese"
    println(recipeIngredients)
}