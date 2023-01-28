package initblock

fun main() {
    val laptop1 = Laptop("macOS")
}

class Laptop(operatingSystem: String) {
    init {
        println("Operating system $operatingSystem is installing...")
    }
}