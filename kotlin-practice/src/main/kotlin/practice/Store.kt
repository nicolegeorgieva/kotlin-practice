package practice

// Welcome to the Amazing Store!                                                                                   [^]
// Available products: ...                                                                                         [^]
// a user registers in an online store                                                                             [^]
// a user needs to log in into his/her account in order to be able to add products to his/her cart
// if he/she doesn't log in successfully, he/she receives a message and is able to only see the products           [^]
// if he/she logs in successfully, he/she receives a message "Would you like to buy something
// (yes/no)?" If he/she says yes, the program asks what do you want to buy and she/he has to pick something from the
// list above. Then the quantity of it. If she/he inputs an item that exist and her/his balance cover the total price
// and the delivery fee, the product is successfully added and if she/he has more money, program continues asking.
// if answer is no, the program asks if the customer wants to finalize purchase and if yes, prints a message
// (successfully purchased and X money left.)
// If she/he can't afford this quantity of a product, the program says how many of that product she/he
// can afford. If he/she can't afford even 1 piece of it, the program says a message and could recommend other product
// that she/he can afford and how many of it. Then asks yes/no question. If yes, program asks how many of it
// (1...could afford).

fun main() {
    println("Welcome to the Amazing Store!")
    val products = listOf(
        Product("book", 20.0),
        Product("book", 20.0),
        Product("book", 20.0),
        Product("book", 20.0),
    )
    println("Available products: ${products.map { it.name }}")

    val user1 = signUp()
    val logIn = loggedIn(user = User(user1.username, user1.password))
}

data class Product(val name: String, val price: Double)

data class User(val username: String, val password: String)

fun signUp(): User {
    val user = readInput("username")
    val pass = readInput("password")
    println("You are signed up successfully!")

    return User(username = user, password = pass)
}

fun loggedIn(user: User) {
    var i = 0

    while (true) {
        println("Log in:")
        val usernameInput = readInput("username")
        val passwordInput = readInput("password")

        if (usernameInput == user.username && passwordInput == user.password) {
            println("You are successfully logged in!")
            return
        } else {
            println("Username and/or password doesn't match.")
        }

        i++
    }
}

private fun readInput(message: String): String {
    println("Enter $message")
    return readln()
}