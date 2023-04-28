package practice.exercise

fun main() {
    val number = "CDIV"
    println(romanToInt(number))
}

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
 */
fun romanToInt(number: String): Int {
    var res = 0

    // IV
    var i = 0
    while (i < number.length) {
        when (number[i]) {
            'V' -> res += 5

            'X' -> if (number.getOrNull(i + 1) == 'L') {
                res += 40
                i++
            } else if (number.getOrNull(i + 1) == 'C') {
                res += 90
                i++
            } else {
                res += 10
            }

            'I' -> if (number.getOrNull(i + 1) == 'V') {
                res += 4
                i++
            } else if (number.getOrNull(i + 1) == 'X') {
                res += 9
                i++
            } else {
                res += 1
            }

            'L' -> res += 50

            'C' -> if (number.getOrNull(i + 1) == 'D') {
                res += 400
                i++
            } else if (number.getOrNull(i + 1) == 'M') {
                res += 900
                i++
            } else {
                res += 100
            }

            'D' -> res += 500
            'M' -> res += 1000
        }

        i++
    }

    return res
}