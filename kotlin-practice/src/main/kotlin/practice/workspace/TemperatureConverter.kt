package practice.workspace

fun main() {
    val celsiusToF: (Double) -> Double = {
        it * 9.0 / 5.0 + 32.0
    }

    val kelvinToCelsius: (Double) -> Double = {
        it - 273.15
    }

    val fahrenheitToKelvin: (Double) -> Double = {
        5.0 / 9.0 * (it - 32.0) + 273.15
    }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToF)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

