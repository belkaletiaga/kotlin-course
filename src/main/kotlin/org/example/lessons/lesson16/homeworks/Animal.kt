package org.example.lessons.lesson16.homeworks

abstract  class Animal {
    open fun makeSound(color: String) {
        println("$color This animal makes no sound.{Colors.RESET}")
    }
}


class Dog: Animal() {
    override fun makeSound(color: String) {
        println("$color Bark${Colors.RESET}")
    }
}

class Cat : Animal() {
    override fun makeSound(color: String) {
        println("$color Meow${Colors.RESET}")
    }
}

class Bird : Animal() {
    override fun makeSound(color: String) {
        println("$color Tweet${Colors.RESET}")
    }
}
