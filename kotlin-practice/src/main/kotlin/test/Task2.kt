package test

fun main() {
    println(isValidIdentifier("Name"))  // true
    println(isValidIdentifier("0name"))  // false
}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s.isBlank()) return false

    if (s.uppercase()[0] !in 'A'..'Z' && s[0] != '_') return false

    for (i in 1 until s.length) {
        if (s.uppercase()[i] !in 'A'..'Z' && s[i] != '_' && s[i] !in '0'..'9') return false
    }

    return true
}