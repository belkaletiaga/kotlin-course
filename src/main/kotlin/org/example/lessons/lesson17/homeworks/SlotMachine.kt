package org.example.lessons.lesson17.homeworks

//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и
//возвращаемые значения), включая модификаторы доступа (private для приватных)

abstract class SlotMachine(
    val color: String,
    val model: String,
    val hasGamePad: Boolean
) {
    private var isOn = false
    private var osIsLoaded = false
    private val games = mutableListOf(
        "Mario",
        "Bomber",
        "Tetris",
        "Death stranding",
    )
    private var balance = 0.0
    private var owner = ""
    private var sessionCost = 5.0
    private var pin: String = "1234"
    private var gameSessionIsCharged = false
    var supportPhone = ""
        private set
    fun turnOn() {
        isOn = true
        loadOs()
    }
    fun turnOff() {
        shutDownOs()
        isOn = false
    }
    private fun loadOs() {
        println("ОС загружена")
    }
    private fun shutDownOs() {
        println("Работа ОС завершена")
    }
    fun showGames() = games.toList()
    fun play(gameName: String) {
        if (!gameSessionIsCharged) {
            println("Оплати игру прежде чем начать")
            return
        }
        if (gameName !in games) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена" )
        }
        gameSessionIsCharged = false
    }
    fun pay() {
        balance += sessionCost
    }
    fun withdraw(pin: String): Double {
        if (pin != this.pin) {
            return 0.0
        }
        return openSafe()
    }
    private fun openSafe(): Double {
        val withdraw = balance
        balance = 0.0
        return withdraw
    }

}