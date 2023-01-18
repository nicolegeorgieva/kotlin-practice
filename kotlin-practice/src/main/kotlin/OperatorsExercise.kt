fun main() {
    println("Write the amount you have in your bank account.")

    println(calculateMoney())
}

private fun calculateMoney(): String {
    val bankAmount = readlnOrNull()?.toDoubleOrNull() ?: return "Invalid amount"
    if (bankAmount < 0) return "Amount must be a positive number"
    if (bankAmount > 10000) return "We don't support interests after 10 000"

    val newBankAmount = bankAmount * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    return "Your final amount will be $newBankAmount"
}