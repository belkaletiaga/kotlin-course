package org.example.lessons.lesson09.homeworks

fun main() {
//1. Создайте пустой неизменяемый список целых чисел.
    val listOne: List<Int> = listOf()
    println("1: $listOne")
//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val listTwo: List<String> = listOf("Meow", "Woof", "Cock-a-doodle-doo")
    println("2: $listTwo")

//3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val listThree: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("3: $listThree")

//4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val listFour: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    listFour.add(6)
    listFour.add(7)
    listFour.add(8)
    println("4: $listFour")

//5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val listFive: MutableList<String> = mutableListOf("Hello", "World", "Peace")
    listFive.remove("World")
    println("5: $listFive")

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val listSix: List<Int> = listOf(1, 58, 3, 4, 5)
    print("6: ")
    for (i in listSix) {
        print("$i ")
    }
    println()

//7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val listSeven = listOf("one", "two ", "three " , "four")
    println("7: ${listSeven[1]}")

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент
//с индексом 2 на новое значение).
    val listEight = mutableListOf(100, 258, 1, 13, 85)
    listEight[4] = 25845
    println("8: $listEight")

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
//Реши задачу с помощью циклов.
    val listA = listOf("one", "two", "three")
    val listB = listOf("four", "five", "six")
    val listNine = mutableListOf<String>()
    for (item in listA) {
        listNine.add(item)
    }
    for (item in listB) {
        listNine.add(item)
    }
    println("9: $listNine")
//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val listTen = listOf(45, 5, 64, 444, 5, 5, 65, 2)
    var min = Integer.MAX_VALUE
    var max = Integer.MIN_VALUE
    for (it in listTen) {
        if (it < min){
            min = it
            continue
        }
        if (it > max){
            max = it
        }
    }
    println("10: Минимум: $min, Максимум: $max")

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val listEleven= listOf(33, 52, 5, 4, 43, 7, 6, 8)
    val evenList = mutableListOf<Int>()
    for (it in listEleven) {
        if (it % 2 == 0) {
            evenList.add(it)
        }
    }
    println("11: $evenList")
}
