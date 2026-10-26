package org.example.lessons.lesson15.homeworks

class InterleavedMaterials : Materials() {
    fun addInterleaved(newMaterials: List<String>) {
        val existing = extractMaterials()
        val result = mutableListOf<String>()
        val size = maxOf(existing.size, newMaterials.size)

        for (i in 0 until size) {
            if (i < newMaterials.size) result.add(newMaterials[i])
            if (i < existing.size)     result.add(existing[i])
        }
        result.forEach { addMaterial(it) }
    }
}