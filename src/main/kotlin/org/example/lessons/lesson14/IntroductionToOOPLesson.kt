package org.example.lessons.lesson14

fun main() {
    val lamp = Lamp(true)
    lamp.toggle()

    val wind = Wind(100)
    println("Скорость ветра в м.с: ${wind.convertToMetersPerSecond()}")

    Sun.shine()
}

//1. Физический предмет: Лампа Создайте класс Lamp, который будет представлять лампу. У лампы должно быть свойство isOn
//(Boolean), которое показывает, включена ли лампа. Добавьте метод toggle(), который меняет состояние лампы (включает или
//выключает её).
class Lamp(var isOn: Boolean) {
    fun toggle(){
       isOn = !isOn
       val state = if(isOn) "on" else "off"
       println(" The lamp is $state")
    }
}

//2. Явление: Ветер Создайте класс Wind, который будет представлять ветер. В классе должно быть свойство speed (Int), которое
//описывает скорость ветра (в км/ч). Добавьте метод convertToMetersPerSecond(), который пересчитывает скорость ветра в
//метры в секунду и возвращает это значение.
class Wind(val speed : Int) {
    fun convertToMetersPerSecond(): Double {
        return speed / 3.6
    }
}

//3. Природное явление: Солнце Создайте объект Sun, который будет представлять солнце. Добавьте свойства isShining (Boolean),
//чтобы отображать, светит ли солнце в данный момент, и temperature (Int), чтобы отображать текущую температуру на
//поверхности солнца в градусах Цельсия. Добавьте метод shine(), который выводит сообщение, если солнце светит.
object Sun {
    val isShining: Boolean = true
    val temperature: Int = 7598
    fun shine(){
        if(isShining){
            println("Солнце светит")
        } else{
            println("Солнце не светит")
        }
    }
}

//4. Транспортное средство: Автомобиль Создайте класс Car, который будет представлять автомобиль. В классе должны быть
//свойства brand (String) и model (String). Добавьте companion object, который будет содержать список популярных брендов
//автомобилей. Добавьте метод showInfo(), который выводит информацию об автомобиле.


//5. Заказ в ресторане: Блюдо Создайте data class Dish, который будет представлять блюдо в ресторане. У него должны быть
//свойства name (String), ingredients (List), и price (Double). Добавьте метод describeDish(), который выводит описание
//блюда и его ингредиенты.