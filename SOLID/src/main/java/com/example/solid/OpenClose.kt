package com.example.solid

// Ejemplo
fun main() {
    val horse = Horse()
    horse.move()
    horse.whinny()
}

open class Animal {
    fun move() {
        println("I am moving!")
    }
}

// Caballo puede tener la funcionalidad de relincho
//Pero no puede modificar la funcionalidad de moverse
class Horse: Animal() {
    fun whinny() {
        println("Neigh!")
    }
}