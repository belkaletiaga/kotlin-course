package org.example.lessons.lesson16.homeworks

enum class LogLevel { INFO, WARNING, ERROR, DEBUG }
class Logger {
    fun log(message: String) {
        println("${Colors.GREEN}[INFO]${Colors.RESET} $message")
    }

    // Перегрузка: уровень логирования + сообщение
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> println("${Colors.GREEN}[INFO]${Colors.RESET} $message")
            LogLevel.WARNING -> println("${Colors.YELLOW}[WARNING]${Colors.RESET} ${Colors.YELLOW}$message${Colors.RESET}")
            LogLevel.ERROR -> println("${Colors.WHITE}${Background.RED}[ERROR] $message${Background.RESET}${Colors.RESET}")
            LogLevel.DEBUG -> println("${Colors.CYAN}[DEBUG]${Colors.RESET} $message")
        }
    }

    // Перегрузка: список сообщений (все с уровнем INFO)
    fun log(messages: List<String>) {
        messages.forEach { log(it) }
    }

    // Перегрузка: Exception (с уровнем ERROR)
    fun log(ex: Exception) {
        log(LogLevel.ERROR, ex.message ?: ex.toString())
    }
}