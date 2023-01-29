package companionobject

fun main() {
    KotlinCourse.printInfo()
}

class KotlinCourse() {
    companion object {
        fun printInfo() {
            println("Kotlin is an innovative programming language.")
            println("This course's practice.main goal is to master the Kotlin language concepts.")
        }
    }
}