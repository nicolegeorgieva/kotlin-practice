package book

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val options = arrayOf("Red", "Amber", "Green")
    var crossWalk = options[Random.nextInt(options.indices)]

    if (crossWalk == "Green") {
        println("Walk!")
    }

    unless(crossWalk == "Green") {
        println("Stop!")
    }
}

fun unless(condition: Boolean, code: () -> Unit) {
    if (!condition) {
        code()
    }
}