package standardfunction

fun main() {
    val clients = mutableListOf<String?>()
    var i = 0

    while (true) {
        println("Input your name")
        val input = readln()

        if (input == "stop") {
            break
        }

        input.let {
            if (it.isEmpty()) {
                clients.add(null)
            } else {
                clients.add(it)
            }
        }

        clients.forEach {
            it?.let {
                println("Hello, $it.")
            }
        }

        i++
    }

    println(clients)
}