package algorithms

fun main() {
    val arr = intArrayOf(1, 2, 3)
    arr.swap(0, 2)
    println(arr.toList())
}

// [1,2,3].swap(0, 2) -> 3, 2, 1

private fun IntArray.swap(i: Int, j: Int) {
    val first = this[i]

    this[i] = this[j]
    this[j] = first
}