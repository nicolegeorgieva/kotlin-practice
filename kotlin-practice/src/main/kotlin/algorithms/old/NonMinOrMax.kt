package algorithms.old

fun main() {
    val nums = intArrayOf(3, 2, 1, 4)
    val nums2 = intArrayOf(1, 2)

    println(findNonMinOrMax(nums))
    println(findNonMinOrMax(nums2))
}

/*
Input: nums = [3,2,1,4]
Output: 2

Input: nums = [1,2]
Output: -1
 */
private fun findNonMinOrMax(nums: IntArray): Int {
    val uniqueNums = nums.toSet()
    if (uniqueNums.size <= 2) return -1

    val numbers = uniqueNums.sorted()

    return numbers[1]
}