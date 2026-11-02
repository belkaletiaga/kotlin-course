package org.example.lessons.lesson16.homeworks

import kotlin.math.sin

const val PI = 3.14

abstract class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = PI * radius * radius

}

class Square(private val side: Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(private val a: Double,
             private val b: Double,
             private val angleDegrees: Double) : Shape() {
    override fun area(): Double {
        val angleRadians = Math.toRadians(angleDegrees)
        return 0.5 * a * b * sin(angleRadians)
    }
}
