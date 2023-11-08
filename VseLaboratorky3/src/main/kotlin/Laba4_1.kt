fun main()
{
    println(exames())

}
fun exames ()
{
    val exams = listOf("Математику", "Программирование", "Моделирование")
    println("Введите имя студента")
    val student = readln()
    val maxMarks = 10

    exams.forEach { exam ->
        var mark = (0..10).random()
        println("$student сдал $exam с балом $mark")
        if ( mark >=6) //
            println("Подготовка к экзамену $exam хорошая")
        else
            println("Подготовка к экзамену плохая")
    }

}