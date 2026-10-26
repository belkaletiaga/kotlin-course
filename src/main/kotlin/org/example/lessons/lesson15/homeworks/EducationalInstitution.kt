package org.example.lessons.lesson15.homeworks

open class EducationalInstitution(val name: String, val address: String) {
    open fun info() = "$name, $address"
}

open class School(name: String, address: String, val grades: Int) : EducationalInstitution(name, address)
class PrimarySchool(name, address) : School(name, address, 4)

open class University(name, address, val faculties: Int) : EducationalInstitution(name, address)
