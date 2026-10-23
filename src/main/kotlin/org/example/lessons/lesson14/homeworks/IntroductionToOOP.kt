package org.example.lessons.lesson14.homeworks

fun main() {
    println("1: ")
    val party = Party("Улица строителей, 25", 3)
    party.details()

    println("2: ")
    val emotion = Emotion("счабстья", 4)
    emotion.express()

    println("3: ")
    Moon.showPhase()

    println("4: ")
    val banana = Product("Banana", 145, 25)
    val cucumber = banana.copy("Cucumber")
    val bananaMini = Product("Banana", 145, 25)
    val bananana = banana.equals(bananaMini)
    println(banana)
    println(cucumber)
    println(bananana)

    println("5: ")
    val concert = Concert("Коррозия металла", "БКЗ", 500, 5)
    concert.getInfo()
    concert.buyTicket()
    concert.getInfo()

}

//1. Событие: вечеринка. Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String)
//и attendees (Int). Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
class Party(var location: String, var attendees: Int) {
    fun details() {
        println("Вечеринка будет по адресу - $location. Количество гостей: $attendees чел. ")
    }
}

//2. Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type
//(String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и
//интенсивности.
class Emotion(val type: String, var intensity: Int) {
    fun express() {
        print("Ощущение $type c уровнем интенсивности $intensity. Состояние: ")
        if (type == "злость") {
            when (intensity) {
                2 -> println("отличное")
                3 -> println("хорошее")
                4 -> println("удовлетворительное")
                5 -> println("ужасное")
                else -> println("Введена несуществующая интенсивность. Введите значение от 2 до 5")
            }
        } else if (type == "счастья") {
            when (intensity) {
                2 -> println("ужасное")
                3 -> println("удовлетворительное")
                4 -> println("хорошее")
                5 -> println("отличное")
                else -> println("Введена несуществующая интенсивность. Введите значение от 2 до 5")
            }
        } else println("Такой эмоции не существует")
    }
}

//3. Природное явление: луна. Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible
//(Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны
//(например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.
object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println("В данный момент луну видно и она находится в фазе $phase")
        } else println("В данный момент луну не видно")
    }
}

//4. Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине. У него должны
//быть свойства “название”, “цена”, “количество”.
data class Product(val name: String, val price: Int, val quantity: Int)

//5. Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
//“место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который
//выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

class Concert(val band: String, val venue: String, val price: Int, val capacity: Int) {
    private var ticketSold = 0
    fun getInfo() {
        println(
            "Концерт группы \"$band\" будет в $venue. " +
                    "Стоимость билета $price рублей. " +
                    "Осталось ${capacity - ticketSold} мест(а)"
        )
    }

    fun buyTicket() {
        ticketSold++
    }
}

//6. Стеллаж и полки.
//
//Цель задания: Создать систему управления складским пространством с использованием классов "Стеллаж" и
// "Полка стеллажа".
//Класс Shelf (Полка Стеллажа)

//Класс Rack (Стеллаж)


