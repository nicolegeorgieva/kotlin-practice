fun main() {
    val animals = 3
    val producingAnimals = true
    val children = 2

    val getFundingDecision = (animals <= 5 && producingAnimals) || children + 1 >= 3
    println(getFundingDecision)
}