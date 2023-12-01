package algorithms.old

fun main() {
    println(waysToClimbStairs(10))
}

// you can either climb 1 or 2 steps

// 1 stairs -> 1

// 2 stairs -> 2

// 3 stairs -> 3

// 4 stairs -> 5
// 1 1 1 1
// 1 2 1
// 2 2
// 2 1 1
// 1 1 2

// 5 stairs -> 8
// 1 1 1 1 1
// 1 2 1 1
// 2 1 1 1
// 1 1 2 1
// 1 1 1 2
// 2 2 1
// 1 2 2
// 2 1 2
val resultsCache = mutableMapOf<Int, Int>()

private fun waysToClimbStairs(n: Int): Int {
    if (resultsCache.contains(n)) {
        println("Reusing cache for n = $n")
        return resultsCache[n]!!
    }

    val answer = when (n) {
        1 -> 1
        2 -> 2
        else -> waysToClimbStairs(n - 1) + waysToClimbStairs(n - 2)
    }

    resultsCache[n] = answer
    println("The answer for n = $n is ${resultsCache[n]}")

    return answer
}

