package org.example.lessons.lesson15.homeworks

class SortedMaterials : Materials() {
    fun addSorted(material: String) {
        val existing = extractMaterials()
        (existing + material)
            .sorted()
            .forEach { addMaterial(it) }
    }
}