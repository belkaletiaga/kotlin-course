package org.example.lessons.lesson16.homeworks

abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        // Чёрные буквы на белом фоне
        for (word in text.split(" ")) {
            if (word.isEmpty()) continue
            println("${Colors.BLACK}${Background.WHITE} $word ${Colors.RESET}")
        }
    }
}

class InkjetPrinter : Printer() {
    private val colorPairs = listOf(
        Colors.RED to Background.WHITE,
        Colors.GREEN to Background.BLACK,
        Colors.YELLOW to Background.BLUE,
        Colors.CYAN to Background.PURPLE,
        Colors.PURPLE to Background.CYAN,
        Colors.WHITE to Background.RED,
        Colors.BLUE to Background.YELLOW,
        Colors.BLACK to Background.GREEN,
    )

    override fun print(text: String) {
        text.split(" ").forEachIndexed { index, word ->
            val (fg, bg) = colorPairs[index % colorPairs.size]
            println("$fg$bg $word ${Background.RESET}${Colors.RESET}")
        }
    }
}