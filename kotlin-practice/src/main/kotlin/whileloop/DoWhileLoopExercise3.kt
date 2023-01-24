package whileloop

fun main() {
    var finished = false

    do {
        val usernames = hashSetOf("john", "bob", "alice")
        println("Choose a username")
        val input = readln()

        if (usernames.contains(input)) {
            println("The username $input is taken.")
        } else {
            usernames.add(input)
            println("The username $input is successfully added.")
            finished = true
        }
    } while (!finished)
}