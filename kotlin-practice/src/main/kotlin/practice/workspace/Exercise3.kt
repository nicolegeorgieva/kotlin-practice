package practice.workspace

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    trickOrTreat(false, coins)()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        println(extraTreat(5))
        treat
    }
}