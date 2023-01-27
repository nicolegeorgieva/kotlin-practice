package oop

fun main() {
    val user1 = Jetpack()

    user1.burn(10)
    println("User height is ${user1.userHeight}.")

    user1.stop(2)
    println("User height is ${user1.userHeight}.")

    user1.burn(5)
    println("User height is ${user1.userHeight}.")

    user1.stop(8)
    println("User height is ${user1.userHeight}.")
}

class Jetpack {
    var userHeight = 0

    fun burn(seconds: Int) {
        println("Burning for $seconds seconds.")
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        println("Stopping for $seconds seconds.")
        userHeight -= 3 * seconds
        if (userHeight < 0) {
            userHeight = 0
        }
    }
}