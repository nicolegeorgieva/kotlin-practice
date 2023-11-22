package test1

fun main() {
    println(correctBraces("[]"))
    println(correctBraces("[]]"))
    println(correctBraces("{]]"))
}

// (())
// []
// ][
private fun correctBraces(input: String): Boolean {
    val bracesCount = mutableMapOf(
        "()" to 0,
        "[]" to 0,
        "{}" to 0,
    )

    fun changeCount(type: String, change: Int) {
        bracesCount[type] = bracesCount[type]!! + change
    }


    for (char in input) {
        when (char) {
            '(' -> {
                changeCount("()", change = 1)
            }

            '{' -> {
                changeCount("{}", change = 1)
            }

            '[' -> {
                changeCount("[]", change = 1)
            }

            ')' -> {
                changeCount("()", change = -1)
                if (bracesCount["()"]!! < 0) return false
            }

            ']' -> {
                changeCount("[]", change = -1)
                if (bracesCount["[]"]!! < 0) return false
            }

            '}' -> {
                changeCount("{}", change = -1)
                if (bracesCount["{}"]!! < 0) return false
            }
        }
    }

    return bracesCount.values.all { it == 0 }
}