package test

fun main() {
    everyFifthNonSpace("abc d e fgh ik")
}

fun everyFifthNonSpace(s: String) {
    val transformedStr = s.split(" ").joinToString("")
    var times = 0
    println(transformedStr)

    for (i in transformedStr.indices) {
        times++
        if (i != 0 && times % 5 == 0) {
            println(transformedStr[i])
        }
    }
}