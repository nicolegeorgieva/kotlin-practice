package practice

fun main() {
    println(intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toSet())
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val result = mutableSetOf<Int>()

    for (i in nums1.indices) {
        for (y in nums2.indices) {
            if (nums1[i] == nums2[y]) {
                result.add(nums1[i])
            }
        }
    }

    return result.toIntArray()
}