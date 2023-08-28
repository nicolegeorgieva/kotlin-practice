package test

fun main() {
    println(countDigits(764241, 4)) // 2
}

fun countDigits(number: Int, digit: Int): Int {
    var worker = number.toString()
    var occurrences = 0

    for (num in worker) {
        if (num.toString().toInt() == digit) {
            occurrences++
        }
    }

    return occurrences
}