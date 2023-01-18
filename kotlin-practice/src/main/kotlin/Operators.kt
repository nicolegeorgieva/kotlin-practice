fun main(args: Array<String>) {
    println("Write your bank account amount")

    val userBankAccountAmount = readlnOrNull()
    val contestPrize = userBankAccountAmount?.toDoubleOrNull()

    if (contestPrize != null) {
        println("You have a total of ${contestPrize * 3}.")
    } else {
        println("Invalid amount.")
    }
}