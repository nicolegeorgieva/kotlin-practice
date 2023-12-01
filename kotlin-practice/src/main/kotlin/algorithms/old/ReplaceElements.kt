package algorithms.old

fun main() {
    val arr1 = intArrayOf(17, 18, 5, 4, 6, 1)
    val arr2 = intArrayOf(400)

    println(replaceElements(arr1).toList())
    println(replaceElements(arr2).toList())
}

/*
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]

Input: arr = [400]
Output: [-1]
 */
private fun replaceElements(arr: IntArray): IntArray {
    if (arr.size <= 1) return intArrayOf(-1)

    for (i in arr.indices) {
        if (i == arr.lastIndex) {
            arr[i] = -1
            break
        }

        arr[i] = findMaxBetween(input = arr, i1 = i + 1)
    }

    return arr
}

private fun findMaxBetween(input: IntArray, i1: Int): Int {
    var maxNum = Int.MIN_VALUE

    for (y in i1..input.lastIndex) {
        if (input[y] > maxNum) {
            maxNum = input[y]
        }
    }

    return maxNum
}