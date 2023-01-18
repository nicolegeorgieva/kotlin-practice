fun main(args: Array<String>) {
    println("Write your bank account amount")

    val userBankAccountAmount = readlnOrNull()
    val contestPrize = userBankAccountAmount?.toDoubleOrNull()

    if (contestPrize != null) {
        val reward = contestPrize * 3
        println("You have a total of ${reward}.")
    } else {
        println("Invalid amount.")
    }
}