package book

fun main() {
    val lambda = getConversionLambda("KgsToPounds")(2.5)
    println(lambda)

    println(convert(2.5, getConversionLambda("KgsToPounds")))

    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    val kgToTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)

    val value = 17.4
    println("$value kgs is ${convert(value, kgToTonsLambda)} US tons.")
}

fun getConversionLambda(str: String): (Double) -> Double {
    return when (str) {
        "CentigradeToFahrenheit" -> {
            { it * 1.8 + 32 }
        }

        "KgsToPounds" -> {
            { it * 2.204623 }
        }

        "PoundsToUSTons" -> {
            { it / 2000.0 }
        }

        else -> {
            { it }
        }
    }
}

fun combine(lambda1: (Double) -> Double, lambda2: (Double) -> Double): (Double) -> Double {
    return { x: Double -> lambda2(lambda1(x)) }
}