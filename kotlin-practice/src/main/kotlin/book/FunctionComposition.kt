package book

fun <A, B, C> chain(f: (A) -> B, g: (B) -> C): (A) -> C {
    return { a ->
        val b = f(a)
        val c = g(b)
        c
    }
}

fun <A, B, C> ((A) -> B).chain2(g: (B) -> C): (A) -> C {
    return { a ->
        val b = this(a)
        val c = g(b)
        c
    }
}

infix fun <A, B, C> ((A) -> B).then(g: (B) -> C): (A) -> C {
    return { a ->
        val b = this(a)
        val c = g(b)
        c
    }
}


fun main() {
    val bgnToEur = { bgn: Double ->
        bgn / 1.95
    }
    val eurToUsd = { eur: Double ->
        eur * 1.2
    }

    val bgnToUsd = chain(bgnToEur, eurToUsd)

    val result = bgnToUsd(10.0)
    println(result)

    val bgnToUsdFormatted = chain(bgnToUsd, ::formatUsd)
    println(bgnToUsdFormatted(10.0))

    println(
        chain(chain(bgnToEur, eurToUsd), ::formatUsd)(10.0)
    )

    println(
        bgnToEur.chain2(eurToUsd).chain2(::formatUsd).invoke(10.0)
    )

    println(
        (bgnToEur then eurToUsd then ::formatUsd).invoke(10.0)
    )
}

private fun formatUsd(usd: Double): String {
    return "$usd USD"
}