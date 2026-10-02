package org.example.lessons.lesson09.homeworks

fun main() {
//Работа с массивами Array
//1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val numbers1 = arrayOf(1, 2, 3, 4, 5)
    println("1: " + numbers1.contentToString())

//2. Создайте пустой массив строк размером 10 элементов.
    val numbers2 = Array(10) { " " }
    println("2: " + numbers2.contentToString())

//3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val numbers3 = DoubleArray(5) { index -> index * 2.0 }
    println("3: " + numbers3.contentToString())

//4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его
//индексу, умноженному на 3.
    val numbers4 = IntArray(5)
    for (i in 0..numbers4.size - 1) {
        numbers4[i] = i * 3
    }
    println("4: " + numbers4.contentToString())

//5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val numbers5: Array<String?> = arrayOf(null, "Meow", "Woof")
    println("5: " + numbers5.contentToString())

//6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val numbers6 = intArrayOf(1, 2, 18)
    val numbers6New = numbers6.copyOf()
    println("6: " + numbers6New.contentToString())

//7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
//Распечатайте полученные значения.
    val numbersA = intArrayOf(1, 5, 10, 20, 30)
    val numbersB = intArrayOf(101, 105, 120, 120, 130)
    val numbersDiff = IntArray(5)
    for (i in numbersA.indices) {
        numbersDiff[i] = numbersB[i] - numbersA[i]
    }
    println("7: " + numbersDiff.contentToString())

//8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
//Реши задачу через цикл while.
    val numbers8 = intArrayOf(1, 5, 10, 20, 30)
    var index = -1
    var i = 0
    while (i < numbers8.size) {
        if (numbers8[i] == 5) {
            index = i
            break
        }
        i++
    }
    println("8: " + index)
//9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val numbers9 = intArrayOf(1, 5, 10, 20, 30)
    println("9:")
    for (i in numbers9.indices) {
        if (numbers9[i] % 2 == 0) {
            println("Четное: ${numbers9[i]}")
        } else {
            println("Нечетное: ${numbers9[i]}")
        }
    }
//10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
//в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    println("10:")
    val str = arrayOf("one", "two", "five", "oneone", "ten")
    findElement(str, "YH")

}

//10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
//в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun findElement(array: Array<String>, search: String) {
    var found = false
    for (element in array) {
        if (element.contains(search)) {
            found = true
            println("Найден элемент: $element")
        }
    }
    if (!found) {
        println("Элементы, содержащие \"$search\", не найдены")
    }
}
