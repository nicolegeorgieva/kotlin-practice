package ifstatement

fun main() {
    val hasEggs = true
    val hasBacon = false

    val eggPrice = 5
    val baconPrice = 20
    var totalSum = 0

    if (hasEggs) {
        totalSum += eggPrice * 12
        if (hasBacon) {
            totalSum += baconPrice * 2
        }
    } else {
        println("No eggs available.")
    }

    println("Total is ${totalSum}.")
}