package forloop

fun main() {
    val emoji = "\uD83D\uDE00"

    for (i in 1..10) {
        for (j in 1..i) {
            print(emoji)
        }
        println()
    }
}