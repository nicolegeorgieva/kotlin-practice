package oop

fun main() {
    val engineer = Engineer()
    val doctor = Doctor()

    engineer.name = "Engineer"
    engineer.salary = 5000

    doctor.name = "Doctor"
    doctor.salary = 3000

    println(
        "The revenue of an ${engineer.name} is ${engineer.work()} and if he/she studies the salary will increase" +
                " to ${engineer.study()} creating a total revenue of ${engineer.work()}."
    )
    println(
        "The revenue of a ${doctor.name} is ${doctor.work()} and if he/she studies the salary will increase" +
                " to ${doctor.study()} creating a total revenue of ${doctor.work()}."
    )
}

open class Job {
    var name = "Regular job"
    var revenue = 0
    var salary = 1000

    fun work(): Int {
        revenue += salary
        return revenue
    }

    fun study(): Int {
        salary += 5000
        return salary
    }
}

class Engineer : Job()

class Doctor : Job()