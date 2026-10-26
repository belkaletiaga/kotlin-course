package org.example.lessons.lesson15.homeworks

open class GeometricFigure (
    val name: String
){
    open fun describe() = "Фигура: $name"
}

open class Polygon (name: String, val sidesCount: Int): GeometricFigure(name) {
    override fun describe() = "Многоугольник: $name, сторон: $sidesCount"
}
class Triangle(name: String, val a: Double, val b: Double, val c: Double) : Polygon(name, 3)
class Quadrilateral(name: String,
                    val a: Double,
                    val b: Double,
                    val c: Double,
                    val d: Double) : Polygon(name, 4)
class Circle(name: String, val radius: Double) : GeometricFigure(name)