package com.example.solid

import kotlin.math.pow
//No se forza al cuadrado a usar un radio

interface Shape {
    fun area(): Double
}

interface CircularShape {
    fun radius(): Double
}

data class Circle(val diameter: Double): Shape, CircularShape {
    override fun radius() = diameter / 2
    override fun area() = Math.PI * radius().pow(2)
}

data class Square(val width: Double, val height: Double): Shape {
    override fun area() = width * height
}