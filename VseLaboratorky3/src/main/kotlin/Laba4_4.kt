fun main() {
    print("Введите сумму вклада: ")
    val depositAmount = readLine()?.toFloatOrNull()
    if (depositAmount == null || depositAmount <= 0) {
        println("Некорректная сумма вклада")
        return
    }

    print("Введите срок вклада в месяцах: ")
    val months = readLine()?.toIntOrNull()
    if (months == null || months <= 0) {
        println("Некорректное количество месяцев")
        return
    }

    val interestRate = 0.07f
    var totalAmount = depositAmount
    for (i in 1..months) {
        val monthlyInterest = totalAmount * interestRate
        totalAmount += monthlyInterest
    }

    println("После $months месяцев сумма вклада составит: $totalAmount")
}