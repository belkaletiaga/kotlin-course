package org.example.lessons.lesson11.homeworks

fun main() {
    //1
    println("${funNothing()}")
    //2
    println(sumCalculate(5, 6))
    //3
    printString("Я ничего не возвращаю")
    //4
    println(average(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    //5
    println(getLengthInt("Meow-Meow"))
    //6
    println(getNullableInt())
    //7
    printListInt(listOf(1, null, 2))
    //8
    println(intToNullableString(0))
    //9
    println(getNullableStrings())
    //10
    println(isNullableBoolean("Мяу", null))
    //11
    println(multiplyByTwo(5))
    //12
    println(isEven(6))
    //13
    printNumbersUntil(7)
    //14
    println(findFirstNegative(listOf(4, 8, -7, 9, 45)))
    //15
    processList(listOf("Meow", "Woof", null, "Cock-a-doodle-doo"))
}

//Задачи на сигнатуру метода
// Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и
// возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для
// устранения ошибок.

//1. Не принимает аргументов и не возвращает значения.
public fun funNothing(): Unit {
    print("1: ")
}

//2. Принимает два целых числа и возвращает их сумму.
public fun sumCalculate(a: Int, b: Int): Int {
    print("2: $a + $b = ")
    return a + b
}

//3. Принимает строку и ничего не возвращает.
public fun printString(str: String) {
    println("3: $str ")
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
public fun average(a: List<Int>): Double{
    print("4: Avg:$a = ")
    if (a.isEmpty()) return 0.0
    return a.average()
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun getLengthInt(str: String? ): Int? {
    print("5: Количество символов в строке: $str = ")
    return str?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
private fun getNullableInt(): Double? {
    print("6:  ")
    return null
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun printListInt(a: List<Int?>) {
    println("7: $a")
}

//8. Принимает целое число и возвращает nullable строку.
public fun intToNullableString(a: Int): String? {
    print("8: ")
    if (a == 0) return null
    return a.toString()
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun getNullableStrings(): List<String?> {
    print("9: ")
    return listOf("фхтагн", null, "ктулху")
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
public fun isNullableBoolean(str: String?, n : Int?): Boolean? {
    print("10: ")
    if (str == null || n == null) return null
    return str.length == n
}

//Задачи на написание кода
// Напишите валидную сигнатуру метода а так же рабочий код для задач.
//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.

fun multiplyByTwo(a: Int): Int{
    print("11: $a * 2 = ")
    return a*2
}

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное,
// и false в противном случае.

fun isEven(a: Int): Boolean{
    print("12: ")
    return a % 2 == 0
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если
// число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.

fun printNumbersUntil(n: Int){
    print("13: ")
    if(n < 1){
        print("$n < 1, сообщение не выводится ")
        return
    }
    for (i in 1..n){
        print("$i ")
    }
    println()
}

//14 Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в
// списке. Если отрицательных чисел нет, функция должна вернуть null.

fun findFirstNegative(n: List<Int>): Int? {
    print("14: ")
    for (item in n){
        if (item < 0) return item
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую
// строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(settings: List<String?>) {
    print("15: ")
    for (item in settings){
        if (item == null) return
        print ("$item ")
    }
    println()
}