fun main() {
    var population = 10_000_000
    var birthRate = 14
    var deathRate = 8

    val finalYear = 10
    var year = 0

    while (year < finalYear) {
        birthRate = (birthRate - 1).coerceAtLeast(7) // Рождаемость не меньше 7
        deathRate = (deathRate - 1).coerceAtLeast(6) // Смертность не меньше 6


        val births = (population * birthRate) / 1000
        val deaths = (population * deathRate) / 1000
        val populationChange = births - deaths


        population += populationChange

        year++
    }

    println("Численность населения через $finalYear лет: $population человек")
}
//Для себя "Шишкин" coerceAtLeast - Эта функция проверяет, больше ли вызывающий объект определенного минимального объекта.
// Он возвращает текущий объект, если он больше, в противном случае возвращает минимальный объект.

