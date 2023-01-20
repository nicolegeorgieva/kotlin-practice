fun main() {
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
    val theirDrinks = setOf("water", "orange juice", "pineapple juice", "milk")

    myDrinks.retainAll(theirDrinks)
    println(myDrinks)
}