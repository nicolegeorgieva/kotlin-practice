package client

import sayhi.sayHi

fun getName() {
    println("Write your name")
    val name = readln()
    sayHi(name)
}