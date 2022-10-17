package com.example.test

class GenericPerson<T>(edad: T) {
    var edad: T = edad

    init {
        this.edad = edad
        println(edad)
    }
}

fun main() {
    var edadInt: GenericPerson<Int> = GenericPerson<Int>(30)
    var edadString: GenericPerson<String> = GenericPerson<String>("30")
}