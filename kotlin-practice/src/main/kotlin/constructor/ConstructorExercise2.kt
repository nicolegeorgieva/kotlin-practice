package constructor

fun main() {
    val user1 = userAccount()
    val user2 = userAccount("Morgana")
    val user3 = userAccount("Nicole", 200.0)
}

class userAccount {
    var userName: String
    var balance: Double
    var tShirtPrice = 20.0

    constructor() {
        userName = "Generic user"
        balance = 100.00
        canAfford()
    }

    constructor(newUserName: String) {
        userName = newUserName
        balance = 10.0
        canAfford()
    }

    constructor(newUserName: String, newBalance: Double) {
        userName = newUserName
        balance = newBalance
        canAfford()
    }

    fun canAfford() {
        if (balance < tShirtPrice) {
            println("Sorry $userName, you can't afford the T-shirt. You need ${tShirtPrice - balance} more money.")
        } else {
            println("${userName}, you can afford ${balance / tShirtPrice} of the T-shirt.")
        }
    }
}