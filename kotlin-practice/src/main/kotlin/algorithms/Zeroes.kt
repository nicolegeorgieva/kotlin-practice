package algorithms

fun main() {
    val nums = intArrayOf(0, 1, 2, 3, 0)

    solve(nums)

    println(nums.toList())
}

/*
Input: nums = [0,1,0,3,12]
Input: nums = [1,3,12,0,0]
Output: [1,3,12,0,0]

Input: nums = [0]
Output: [0]
 */
private fun moveZeroes(nums: IntArray) {
    val new = nums.filter {
        it != 0
    }.toMutableList()

    val zeroesToAdd = nums.size - new.size

    for (i in 1..zeroesToAdd) {
        new += 0
    }

    for (i in new.indices) {
        nums[i] = new[i]
    }
}

fun solve(nums: IntArray) {
    var currentIndex = 0
    var zeroesCount = 0

    for (n in nums) {
        if (n != 0) {
            nums[currentIndex] = n
            currentIndex++
        } else {
            zeroesCount++
        }
    }

    for (i in nums.size - 1 downTo nums.size - zeroesCount) {
        nums[i] = 0
    }
}