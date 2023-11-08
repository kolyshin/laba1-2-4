fun main () {
    val sum: Int = 1001
    val skid: Int = 100
    val procent: Double = 0.05
    if (sum <= 1000) {
        println("Стоимость $sum")
    } else if (sum > 1000 && sum <= 10000) {
        val cost = sum - skid
        println("Стоимость $cost")
    } else {
        val cena = sum-(sum * procent)
        println("Стоимость $cena")
    }
}
