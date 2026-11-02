package org.example.lessons.lesson16.homeworks
object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound(Colors.YELLOW)
    }
    val dog = Dog()
    dog.makeSound(Colors.YELLOW)

    val cat = Cat()
    cat.makeSound(Colors.GREEN)

    val bird = Bird()
    bird.makeSound(Colors.CYAN)


    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(3.0, 6.0, 30.0),
    )
    for (shape in shapes) {
        println(
            "${Colors.BLUE}${shape::class.simpleName}${Colors.RESET}: " +
                    "area = ${Colors.YELLOW}${"%.4f".format(shape.area())}${Colors.RESET}"
        )
    }

    println("\n=== 3. Принтеры ===")
    println("-- Laser --")
    LaserPrinter().print("Hello world from laser printer")
    println("-- Inkjet --")
    InkjetPrinter().print(
        "Kotlin is a modern statically typed programming language that is widely used for Android development and backend services"
    )

    println("\n=== 4. Корзина ===")
    val cart = Cart()
    cart.addToCart("A001")                        // одна единица
    cart.addToCart("A002", 3)                     // количество
    cart.addToCart(mapOf("A003" to 2, "A001" to 5)) // словарь
    cart.addToCart(listOf("A002", "A004", "A005")) // список
    println(cart)

}