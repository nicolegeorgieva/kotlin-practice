fun main() {
    val nums = intArrayOf(1, 3, 2, 4)
    println(findMissing(nums))
}

private fun findMissing(nums: IntArray): Int {
    val sumOfN = sumOfN(n = nums.size + 1)
    val sumNums = nums.sum()

    return sumOfN - sumNums
}

// 4 n nums
private fun sumOfN(n: Int): Int {
    return (n * (n + 1)) / 2
}