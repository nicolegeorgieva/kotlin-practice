package algorithms.old

fun main() {
    val candies = intArrayOf(2, 3, 5, 1, 3)
    val extraCandies = 3

    println(kidsWithCandies(candies, extraCandies))
}

private fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val res = mutableListOf<Boolean>()

    val maxKid = candies.maxBy { it }

    for (kid in candies) {
        val currentKid = kid + extraCandies

        res.add(currentKid >= maxKid)
    }

    return res
}