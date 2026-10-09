package org.example.lessons.lesson10.homeworks

fun main() {
// Задачи на работу со словарём
//1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()
    println("1: $emptyMap")

//2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

    val twoMap: Map<Float, Double> = mapOf(1.2f to 5.2, 1.3f to 6.3, 1.4f to 6.4)
    println("2: $twoMap")

//3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val threeMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    println("3: $threeMap")

//4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val fourMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    fourMap[4] = "four"
    println("4: $fourMap")

//5. Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.
    println("5: ${fourMap[4]}")
    println("5: ${fourMap[7]}")

//6. Удалите определенный элемент из изменяемого словаря по его ключу.
    fourMap.remove(3)
    println("6. После удаления элемента: $fourMap")

//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val sevenMap = mutableMapOf(1.0 to 1, 2.0 to 4, 3.0 to 12, 4.0 to 20, 5.0 to 30, 6.0 to 0)
    print("7:")
    for ((key, value) in sevenMap) {
        if (value == 0) {
            println(" бесконечность")
        } else {
            val result = (key / value)
            print(" $result")
        }
    }

//8. Измените значение для существующего ключа в изменяемом словаре.
    fourMap[4] = "четыре"
    println("8. После изменения значения ключа: $fourMap")

//9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val nineOneMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    val nineTwoMap = mutableMapOf(4 to "four", 5 to "five", 6 to "six")
    val nineMap: MutableMap<Int, String> = mutableMapOf()
    for ((key, value) in nineOneMap) {
        nineMap[key] = value
    }
    for ((key, value) in nineTwoMap){
        nineMap[key] = value
    }

    println("9. После объединения словарей: $nineMap")

//10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.
    val tenMap: MutableMap<String, MutableList<Int>> = mutableMapOf(
        "Пончиков" to mutableListOf(5, 5, 3, 2, 4),
        "Кулебякин" to mutableListOf(5, 3, 5)
    )
    tenMap["Эчпочмаков"] = mutableListOf(4, 2, 4, 2)
    println("10: $tenMap")

//11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в
// словарь. Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку.
// Распечатай полученное множество.
    val elevenMap: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("один", "одиннадцать"),
        2 to mutableSetOf("два", "двенадцать")
    )
    elevenMap[1]?.add("сто один")
    elevenMap[3] =  mutableSetOf("три", "тринадцать")
    println("11: $elevenMap")

//12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать
// цифру 5 в качестве первого или второго значения.
    val twelveMap: MutableMap<Pair<Int, Int>, Int> = mutableMapOf(
        Pair(1, 2) to 1,
        Pair(2, 2) to 2,
        Pair(5, 3) to 3,
        Pair(8, 5) to 2
    )
    for ((pair, value) in twelveMap) {
        if (pair.first == 5 || pair.second == 5) {
            println("12: $pair to $value")
        }
    }

// Задачи на подбор оптимального типа для словаря
//1. Словарь библиотека: Ключи - автор книги, значения - список книг
    val library: MutableMap<String, MutableList<String>> = mutableMapOf()
//2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants: MutableMap<String, MutableList<String>> = mutableMapOf()
//3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val teams: Map<String, MutableList<String>> = mapOf( " " to mutableListOf())
//4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val therapy: MutableMap<String, List<String>> = mutableMapOf()
//5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveler: MutableMap<String, MutableMap<String, List<String>>> = mutableMapOf( "" to mutableMapOf("" to mutableListOf()))
}