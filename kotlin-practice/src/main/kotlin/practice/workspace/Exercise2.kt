package practice.workspace

fun main() {
    trickOrTreat(true)()
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) trick else treat
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}
