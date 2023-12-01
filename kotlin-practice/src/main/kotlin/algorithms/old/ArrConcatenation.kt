package algorithms.old

fun main() {
    val arr = intArrayOf(1, 2, 1)
    println(getConcatenation(arr).toList())
}

/*
Input: nums = [1,2,1] -> 2x
Output: [1,2,1,1,2,1]
 */
private fun getConcatenation(nums: IntArray): IntArray {
    return nums + nums
}