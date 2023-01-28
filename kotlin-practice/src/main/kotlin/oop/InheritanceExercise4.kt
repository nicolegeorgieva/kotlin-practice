package oop

fun main() {
    val carol = Daughter("english")
    println(carol.hairColor)
    carol.say("Hi")
}

open class Mom(nativeLanguage: String) {
    val hairColor = "brown"
    val eyeColor = "blue"

    fun say(message: String) {
        println("Mom says $message")
    }
}

class Daughter(nativeLanguage: String) : Mom(nativeLanguage)