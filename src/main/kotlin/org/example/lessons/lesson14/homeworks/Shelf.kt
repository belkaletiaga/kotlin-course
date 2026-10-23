package org.example.lessons.lesson14.homeworks

//Класс Shelf (Полка Стеллажа)
//Характеристики:
//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.
class Shelf(private val capacity: Int, private var items: MutableList<String>) {

    //Методы:
//Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
    fun addItem(name: String): Boolean {
        if (canAccommodate(name)) {
            items.add(name)
            return true
        }
        return false
    }

//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        items.remove(name)
        return true
    }

//Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места недостаточно.
    fun canAccommodate(name: String): Boolean {
        val spaceUsed = items.map { it.length }.sum()
        val spaceFree = capacity - name.length - spaceUsed
    return spaceFree >= 0
}

//Проверка наличия предмета (containsItem):
//Принимает название предмета
//Возвращает true если такой предмет есть
    fun containsItem(name: String): Boolean {
        if (items.contains(name)) {
            return true
        }
        return false
    }

//Получение списка предметов (getItems):
//Возвращает неизменяемый список предметов
    fun getItems(): List<String> {
        return items.toList()
    }
}