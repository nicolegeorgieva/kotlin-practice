package operator

fun main() {
    println("Write the interest for your bank account.")

    val interest = readlnOrNull()?.toDoubleOrNull()

    if (interest != null) {
        val totalSumAfterAYear = 1 + interest / 100
        println(calculateMoney(totalSumAfterAYear))
    } else {
        println("Invalid interest.")
    }
}

private fun calculateMoney(interest: Double): String {
    println("Write your bank amount.")

    val bankAmount = readlnOrNull()?.toDoubleOrNull() ?: return "Invalid amount"
    if (bankAmount < 0) return "Amount must be a positive number"
    if (bankAmount > 10000) return "We don't support interests after 10 000"

    val newBankAmount = bankAmount * interest * interest * interest * interest * interest
    return "Your final amount will be $newBankAmount"
}