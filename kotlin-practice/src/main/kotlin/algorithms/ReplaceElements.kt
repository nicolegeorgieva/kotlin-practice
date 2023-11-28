package algorithms

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

    var greaterNum = Int.MIN_VALUE
    val numbers = arr
    val endIndex = numbers.lastIndex
    var finalArr = intArrayOf()

    for (i in numbers.indices) {
        if (i == numbers.lastIndex) {
            finalArr += -1
            break
        }

        for (y in i + 1..endIndex) {
            if (numbers[y] > greaterNum) {
                greaterNum = numbers[y]
            }
        }

        if (greaterNum != Int.MIN_VALUE) {
            finalArr += greaterNum
        }

        greaterNum = Int.MIN_VALUE
    }

    return finalArr
}