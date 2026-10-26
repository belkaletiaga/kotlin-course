package org.example.lessons.lesson15.homeworks

class BottomInsertingMaterials : Materials() {
    fun addToBottom(material: String) {
        val existing = extractMaterials()
        addMaterial(material)          // новый элемент будет под индексом 0
        existing.forEach { addMaterial(it) }
    }
}