package org.example.lessons.lesson09.homeworks

fun main() {
//1. Создайте пустое неизменяемое множество целых чисел.
    val setOne: Set<Int> = emptySet()
    println("1: $setOne")

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val setTwo: Set<Int> = setOf(1, 2, 3, 4, 5)
    println("2: $setTwo")

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями
// (например, "Kotlin", "Java", "Scala").
    val setThree: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println("3: $setThree")

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val setFour: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    setFour.add("Swift")
    setFour.add("Go")
    println("4: $setFour")

//5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val setFive: MutableSet<Int> = mutableSetOf(4, 6, 3, 2, 5, 8)
    setFive.remove(2)
    println("5: $setFive")

//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val setSix = setOf(5, 25, 45, 55, 655)
    print("6: ")
    for (number in setSix) {
        print("$number ")
    }
    println()

//7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
    val setSeven = setOf("Kotlin", "Java", "Scala", "C++")
    checkSet(setSeven, "Java")
    checkSet(setSeven, "Meow")

//8. Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    val setEight = setOf("Kotlin", "Java", "Scala")
    val mutableSetEight = mutableListOf<String>()
    for (it in setEight) {
        mutableSetEight.add(it)
    }
    println("8: $mutableSetEight")
}

//7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun checkSet(set: Set<String>, str: String) {
    var found = false
    for (it in set) {
        if (it == str) {
            found = true
            break
        }
    }
    println("Строка \"$str\": $found")
}