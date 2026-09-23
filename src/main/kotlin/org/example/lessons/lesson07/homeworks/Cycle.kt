package org.example.lessons.lesson07.homeworks

fun main() {

    //1. Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        print(i)
        print(" ")
    }
    println()

    //2. Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0) {
            print(i)
            print(" ")
        }
    }
    println()

    //3. Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        print(i)
        print(" ")
    }
    println()

    //4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1) {
        print(i - 2)
        print(" ")
    }
    println()

    //5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        print(i)
        print(" ")
    }
    println()

    //6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20) {
        if (i % 3 == 0) {
            print(i)
            print(" ")
        }
    }
    println()

    // 7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size
    // не включая size.
    var size = 15
    for (i in 3..size step 2) {
        print(i)
        print(" ")
    }
    println()

    //8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter = 0
    while (counter++ < 5) {
        print(counter)
        print(" ")
    }
    println()

    //9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counter1 = 11
    while (counter1-- > 5) {
        print(counter1)
        print(" ")
    }
    println()

    //10. Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter2 = 5
    do {
        print(counter2)
        print(" ")
    } while (counter2-- > 1)
    println()

    //11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter3 = 5
    do {
        print("мяу")
        print(" ")
    } while (++counter3 < 10)
    println()

    //11. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        print(i)
        print(" ")
    }
    println()

    //12. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counter4 = 0
    while (counter4++ < 10) {
        if (counter4 % 3 == 0) {
            continue
        }
        print(counter4)
        print(" ")
    }

    println()
    println()
    println("*********************************************")
    println("#1:")
    // Задача повышенной сложности
    //1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            print(" ")
        }
        println()
    }

    //2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
    println("#2: ")
    println('\u2211' + "arg = " + sum(5))

    //3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
    println("#3: ")
    println("arg! = " + factorial(0))

    //4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
    println("#4: ")
    println('\u2211' + "argEven = " + sumEven(3))

    //5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
    println("#5: ")
    rectangle()

    //6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
    println("#6: ")
    val (even, odd) = sumEvenAndOdd(5)
    println('\u2211' + "argEven = " + even)
    println('\u2211' + "argOdd = " + odd)

}

//2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun sum (arg: Int): Int{
    var sum = 0
    for (i in 1 .. arg){
        sum = i + sum
    }
    return sum
}

//3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factorial(arg: Int): Int{
    var counter = 0
    var result: Int = 1
    while (counter++ < arg){
        result = result * counter
    }
    return result
}
//4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun sumEven(arg: Int): Int{
    var sum = 0
    var counter = 1
    while (counter++ < arg){
        if (counter % 2 == 0){
            sum += counter
        }
    }
    return sum
}

//5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun rectangle() {
    var counter = 0
    while (counter++ < 3) {
        var counter1 = 0
        while (counter1++ < 5) {
            print('*')
        }
        println("")
    }
}

//6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun sumEvenAndOdd(arg: Int): Pair<Int, Int>{
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..arg){
        if (i % 2 == 0){
            sumEven += i
        }else {
            sumOdd += i
        }
    }
    return Pair(sumEven,sumOdd)
}
















