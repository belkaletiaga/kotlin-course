package org.example.lessons.lesson15.homeworks

open class Furniture(val name: String, val material: String) {
    open fun describe() = "$name из $material"
}
open class Seating(name, material, val seats: Int) : Furniture()
class Chair() : Seating()
class Sofa() : Seating()
open class Table() : Furniture() { val legs }
class DiningTable : Table
class Desk : Table