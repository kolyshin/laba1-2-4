

    fun main (){

println(transfer())


    }
fun  transfer()
{
    println("Введите название карты ")
      val card : String = readln()
    println("Введите сумму перевода ")
    val summtrans  = readln().toInt()
        val transmounth  = 300

    when (card)
    {
       "Mastercard" -> if ( 300 < summtrans &&  summtrans < 75000 )
           println("Сумма перевода составит $summtrans")
           else
       {
           val amount = summtrans-(summtrans*0.006+20)
           println("Сумма перевода составит $amount")
       }
        "Maestro" -> if ( 300 < summtrans &&  summtrans < 75000 )
            println("Сумма перевода составит $summtrans")
        else
        {
            val amount = summtrans-(summtrans*0.006+20)
            println("Сумма перевода составит $amount")
        }
        "Visa" -> if (summtrans > 0)
        {
            val amount = summtrans - (summtrans*0.0075)
            println("Сумма перевода составит $amount")
        }
        "Мир" -> if (summtrans > 0)
        {
            val amount = summtrans - (summtrans*0.0075)
            println("Сумма перевода составит $amount")
        }
        "VkPay" -> if (summtrans > 0)
        {
                     println("Сумма перевода составит $summtrans")
        }

    }

}


