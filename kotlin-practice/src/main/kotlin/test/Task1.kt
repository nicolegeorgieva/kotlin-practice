package test

fun main() {
    println(isLowerCase('A'))  // false
    println(isLowerCase('b'))  // true
}

fun isLowerCase(ch: Char): Boolean =
    if (ch.lowercaseChar() == ch) true else false