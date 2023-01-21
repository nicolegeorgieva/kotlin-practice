package operator

fun main() {
    val toys = 2
    val brokenToys = 1
    val startToys = toys - brokenToys
    val oneNotBroken = startToys >= 1

    val newToy = toys < 5 && oneNotBroken
    println(newToy)
}