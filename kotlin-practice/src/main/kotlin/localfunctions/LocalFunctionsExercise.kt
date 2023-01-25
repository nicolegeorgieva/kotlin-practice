package localfunctions

fun main() {
    balanceStatement(mapOf(Pair("Anna", 1000.0), Pair("Morgana", 2000.0)))
}

fun balanceStatement(usersAndBalances: Map<String, Double>) {
    fun doubleAmount(number: Double) = number * 2

    for ((user, balance) in usersAndBalances) {
        println("$user, your doubled balance would be ${doubleAmount(balance)}.")
    }
}