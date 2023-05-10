package practice.workspace

fun main() {
    val speaker = Speaker()
    speaker.volume
    speaker.volume = 20

    println("The volume is ${speaker.volume}")
}

class Speaker {
    var volume: Int = 0
        get() {
            println("Getting volume $field")
            return field
        }
        set(value) {
            println("Setting volume from $field to $value")
            field = value
        }
}