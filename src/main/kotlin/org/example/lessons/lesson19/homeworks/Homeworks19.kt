package org.example.lessons.lesson19.homeworks

import kotlin.text.isNotBlank

//1. Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент, если он
//существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.

fun <S> getMiddleElement(list: List<S>): S? {
    if (list.size % 2 == 0) return null
    return list[list.size / 2]
}

//2. Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового элемента
//и получения всех элементов в виде неизменяемого списка.

class ListHolder<T> {

    private val list = mutableListOf<T>()

    fun add(element: T) {
        list.add(element)
    }

    fun get(): List<T> {
        return list.toList()
    }
}

//3. Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//1.элементов одного типа в элементы другого типа
//2. списка элементов одного типа в список элементов другого типа

interface Mapper<T, S> {
    fun map(a: T): S
    fun map(b: List<S>): List<T>
}

//4. Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>. Метод
//преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов. Метод
//преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(a: String): List<String> {
        return a.split(" ")
    }

    override fun map(b: List<String>): List<List<String>> {
        return b.map { it.split(" ") }
    }
}

//5. Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь, в
//котором ключ и значения поменялись местами.

fun <I, C> transposition(a: Map<I, C>): Map<C, I> {
    return a.map { it }.associate { it.value to it.key }
}

//6. Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом дженерика и
//возвращать булево значение.

interface Validator<T> {
    fun validate(a: T): Boolean
}

//7. Создай класс StringValidator и имплементируй интерфейс Validator с типом String?. Реализуй проверку, что строка не
//является null, не пустая и не состоит из одних пробелов.

class StringValidator : Validator<String?> {
    override fun validate(a: String?): Boolean {
        return a?.isNotBlank() ?: false
    }
}

//8. Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int. Реализуй проверку, что число
// чётное.
class OddValidator : Validator<Int> {
    override fun validate(a: Int): Boolean {
        return a % 2 == 0
    }
}

//9. Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator
// типизированный по типу List с nullable типом дженерика класса
//1. Реализуй проверку:
//1. Ни один элемент списка не является null
//2. Ни один элемент приведённый к типу Double не равен 0.0

class ListValidator<T : Number> : Validator<List<T?>> {

    override fun validate(a: List<T?>): Boolean {
        return a.all { it != null && it.toDouble() != 0.0 }
    }
}