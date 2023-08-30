package book

fun main() {
    val lambda = getConversionLambda("KgsToPounds")(2.5)
    println(lambda)

    println(convert(2.5, getConversionLambda("KgsToPounds")))
}

fun getConversionLambda(str: String): (Double) -> Double {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}