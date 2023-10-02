package flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

suspend fun main() {
    println(fetchNames())

    println("Listening to the flow:")
    val countDownFlow = countDownFlow(10)
        .map {
            if (it % 2 == 0) {
                "even"
            } else {
                "odd"
            }
        }
    countDownFlow.collect {
        println(it)
    }
}

private fun fetchNames(): List<String> {
    return listOf("Iliyan", "Nicole")
}

private fun countDownFlow(from: Int): Flow<Int> {
    return flow {
        for (number in from downTo 0) {
            emit(number)
            delay(1000)
        }
    }
}