package org.example.lessons.lesson16.homeworks

class Cart {
    private val items = mutableMapOf<String, Int>()

    fun addToCart(itemId: String) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    // Перегрузка — добавить amount единиц
    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(itemsToAdd: Map<String, Int>) {
        itemsToAdd.forEach { (id, amount) ->
            items[id] = (items[id] ?: 0) + amount
        }
    }

    // Перегрузка — добавить список (по одной единице)
    fun addToCart(itemIds: List<String>) {
        itemIds.forEach { id ->
            items[id] = (items[id] ?: 0) + 1
        }
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.appendLine("+------------------+------------+")
        sb.appendLine("| Item ID          | Quantity   |")
        sb.appendLine("+------------------+------------+")
        for ((id, qty) in items) {
            sb.appendLine("| ${id.padEnd(16)} | ${qty.toString().padEnd(10)} |")
        }
        sb.appendLine("+------------------+------------+")
        val totalItems = items.values.sum()
        sb.appendLine("Unique articles: ${items.size}")
        sb.appendLine("Total quantity:  $totalItems")
        return sb.toString()
    }
}