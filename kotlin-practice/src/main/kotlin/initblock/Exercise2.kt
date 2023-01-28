package initblock

fun main() {
    val browser = WebBrowser()
}

class WebBrowser() {
    init {
        println("Web browser is connecting.")
        println("http://www.google.com")
    }
}