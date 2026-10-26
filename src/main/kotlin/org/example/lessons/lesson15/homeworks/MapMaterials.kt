package org.example.lessons.lesson15.homeworks

class MapMaterials : Materials() {
    fun addFromMap(map: Map<String, String>) {
        val existing = extractMaterials()
        val keys = map.keys.toList().reversed()
        val values = map.values.toList()

        (keys + existing + values).forEach { addMaterial(it) }
    }
}