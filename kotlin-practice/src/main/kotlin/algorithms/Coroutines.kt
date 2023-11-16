package algorithms

import kotlinx.coroutines.delay
import java.util.*

suspend fun fetchRandomNumber(label: String): String {
    println("Fetching random number for: '$label'")
    delay(1_000)
    return "$label = ${Random().nextInt()}"
}

suspend fun main() {
    myLaunch {
        fetchRandomNumber("x")
        fetchRandomNumber("y")
    }

    val googleRes = myAsync<Int> {
        delay(5000)
        35
    }
    val alexaRes = myAsync<Int> {
        delay(9000)
        30
    }
    val quote = myAsync<String> {
        delay(10_000)
        "Hello"
    }
    // 0.000001s

    // 10s
    println("${quote.await()}: ${(googleRes.await() + alexaRes.await()) / 2}")


}

fun myLaunch(block: suspend () -> Unit) {
    // TODO:
}

class MyDeferred<T> {
    suspend fun await(): T {
        delay(5000)
        TODO()
    }
}

fun <T> myAsync(block: suspend () -> T): MyDeferred<T> {
    TODO()
}