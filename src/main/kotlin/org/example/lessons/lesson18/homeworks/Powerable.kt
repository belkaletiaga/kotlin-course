package org.example.lessons.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

//  ЗАДАЧА 1. Абстрактные классы устройств на основе интерфейсов
//  (методы не реализуем — классы остаются абстрактными)


abstract class AbstractRefrigerator :
    Powerable, Openable, TemperatureRegulatable, LightEmitting

abstract class AbstractWashingMachine :
    Powerable, Openable, WaterContainer, WaterConnection,
    Drainable, Programmable, Timable

abstract class AbstractSmartLamp :
    Powerable, LightEmitting, Programmable, Rechargeable

abstract class AbstractElectronicClock :
    Powerable, Timable, Programmable, BatteryOperated

abstract class AbstractRobotVacuumCleaner :
    Powerable, Movable, Cleanable, Rechargeable,
    Programmable, AutomaticShutdown

abstract class AbstractMechanicalClock :
    Mechanical, Timable

abstract class AbstractFlashlight :
    Powerable, LightEmitting, BatteryOperated

abstract class AbstractCoffeeMachine :
    Powerable, WaterContainer, WaterConnection,
    TemperatureRegulatable, Programmable, Timable

abstract class AbstractSmartSpeaker :
    Powerable, SoundEmitting, Programmable, Rechargeable

//  ЗАДАЧА 2. Абстрактный класс включаемого оборудования

abstract class PowerableDevice : Powerable {

    var isPoweredOn: Boolean = false
        protected set

    /** Имя устройства для логов */
    open fun deviceName(): String = this::class.simpleName ?: "Устройство"

    override fun powerOn() {
        isPoweredOn = true
        println("[${deviceName()}] включено в сеть")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("[${deviceName()}] выключено из сети")
    }
}


//  ЗАДАЧА 3. Абстрактный класс программируемого оборудования
//  (наследуется от включаемого)


abstract class ProgrammableDevice : PowerableDevice(), Programmable {

    protected var currentProgram: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ задать программу «$action»: питание выключено")
            return
        }
        currentProgram = action
        println("[${deviceName()}] задана программа: $action")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ выполнить программу: питание выключено")
            return
        }
        val program = currentProgram
        if (program == null) {
            println("[${deviceName()}] программа не задана")
        } else {
            println("[${deviceName()}] выполняется программа: $program")
        }
    }
}

//  ЗАДАЧА 4. Абстрактный класс оборудования с регулировкой
//  температуры и возможностью открываться
//  (наследуется от программируемого оборудования)


abstract class TemperatureOpenableDevice :
    ProgrammableDevice(), TemperatureRegulatable, Openable {

    override var maxTemperature: Int = 100
    protected var currentTemperature: Int = 20
    protected var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ установить температуру $temp: питание выключено")
            return
        }
        if (temp > maxTemperature) {
            println("[${deviceName()}] температура $temp превышает максимум ($maxTemperature)")
            return
        }
        currentTemperature = temp
        println("[${deviceName()}] температура установлена: $temp")
    }

    override fun open() {
        if (isOpen) {
            println("[${deviceName()}] уже открыто")
            return
        }
        isOpen = true
        println("[${deviceName()}] открыто")
    }

    override fun close() {
        if (!isOpen) {
            println("[${deviceName()}] уже закрыто")
            return
        }
        isOpen = false
        println("[${deviceName()}] закрыто")
    }
}


//  ЗАДАЧА 5. Конкретные устройства

class Refrigerator : TemperatureOpenableDevice(), LightEmitting {

    override var maxTemperature: Int = 8

    override fun powerOn() {
        super.powerOn()
        println("[${deviceName()}] компрессор запущен, начинается охлаждение")
    }

    override fun emitLight() = println("[${deviceName()}] свет внутри включён")
    override fun completeLiteEmission() = println("[${deviceName()}] свет внутри выключен")
}

class WashingMachine : TemperatureOpenableDevice(),
    WaterContainer, WaterConnection, Drainable, Timable {

    override var maxTemperature: Int = 95
    override val capacity: Int = 8

    override fun fillWater(amount: Int) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ набрать воду: питание выключено")
            return
        }
        println("[${deviceName()}] набрано $amount л воды")
    }

    // Один метод удовлетворяет и WaterContainer, и WaterConnection
    override fun getWater(amount: Int) {
        println("[${deviceName()}] забрано $amount л воды")
    }

    override fun connectToWaterSupply() = println("[${deviceName()}] подключено к водопроводу")
    override fun connectToDrain() = println("[${deviceName()}] подключено к сливу")

    override fun drain() {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ слить воду: питание выключено")
            return
        }
        println("[${deviceName()}] вода слита")
    }

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ задать таймер: питание выключено")
            return
        }
        println("[${deviceName()}] таймер установлен на $time мин")
    }
}

class Kettle : TemperatureOpenableDevice(), WaterContainer, LightEmitting {

    override var maxTemperature: Int = 100
    override val capacity: Int = 2

    override fun fillWater(amount: Int) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ набрать воду: питание выключено")
            return
        }
        println("[${deviceName()}] набрано $amount л воды")
    }

    override fun getWater(amount: Int) = println("[${deviceName()}] налито $amount л воды")

    override fun emitLight() = println("[${deviceName()}] подсветка кнопки включена")
    override fun completeLiteEmission() = println("[${deviceName()}] подсветка кнопки выключена")
}

class Oven : TemperatureOpenableDevice(), Timable, LightEmitting {

    override var maxTemperature: Int = 250

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("[${deviceName()}] НЕЛЬЗЯ задать таймер: питание выключено")
            return
        }
        println("[${deviceName()}] таймер установлен на $time мин")
    }

    override fun emitLight() = println("[${deviceName()}] свет внутри духовки включён")
    override fun completeLiteEmission() = println("[${deviceName()}] свет внутри духовки выключен")
}
