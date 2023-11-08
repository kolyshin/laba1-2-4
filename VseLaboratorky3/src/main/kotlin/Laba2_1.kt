
val timeSeconds = 14000
val min = timeSeconds/60
val hours = min/60
fun main () {


    println(agoToText(timeSeconds))
}


fun agoToText(timesec: Int) = when {
    timesec > 3 * 24 * 60 * 60 -> "был(а) давно"
    timesec > 2 * 24 * 60 * 60 -> "был(а) позавчера"
    timesec > 24 * 60 * 60 -> "был(а) вчера"
    timesec > 60 * 60 -> "был(а) в сети $hours час${timeHours(hours)} назад"
    timesec > 60 -> "был(а) в сети $min минут${timeMinutes(min)} назад"
    else -> "был(а) только что"
}

fun timeMinutes(min: Int) = when {
    min % 10 == 1 -> "у"
    min % 10 in 2..4 -> "ы"
    else -> ""
}

fun timeHours(hours: Int) = when {
    hours == 1 || hours % 100 == 21 -> ""
    hours in 2..4  -> "а"
    else -> "ов"
}

