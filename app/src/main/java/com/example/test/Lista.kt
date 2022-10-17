package com.example.test
//Generic
class Lista<T> {
    private val elementos = mutableListOf<T>()

    fun size(): Int = this.elementos.size

    fun put(elemento: T) {
        this.elementos.add(elemento)
    }

    fun pop(): T = this.elementos.removeAt(this.elementos.lastIndex)

    override fun toString() = this.elementos.toString()
}

fun main() {

    val listaInt = Lista<Int>()
    listaInt.put(1)
    listaInt.put(3)
    listaInt.put(2)
    println(listaInt.size()) // 3
    println(listaInt.pop())  // 2
    println(listaInt)        // [1, 3]
    println(listaInt.size()) // 2

    val listaStr = Lista<String>()
    listaStr.put("Kotlin")
    listaStr.put("Doc")
    listaStr.put("Android")
    println(listaStr.size()) // 3
    println(listaStr.pop())  // Android
    println(listaStr)        // [Kotlin, Doc]
    println(listaStr.size()) // 2
}