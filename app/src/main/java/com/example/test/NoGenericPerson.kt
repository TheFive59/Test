package com.example.test

class NoGenericPerson (edad: Int) {
    var edad: Int = edad

    init {
        this.edad = edad
        println(edad)
    }
}

    fun main() {
        var edadInt: NoGenericPerson= NoGenericPerson(30)
        var ed=30
        var edadString: NoGenericPerson= NoGenericPerson(ed) // ERROR: Type mismatch:
        //inferred type is String but Int was expected
    }