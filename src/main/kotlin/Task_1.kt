fun main(){
    val userSeconds = 350
    val minutes = userSeconds / 60
    val hours = userSeconds / 3600
    val firstMassage = "был(а)"
    val textInform = when (agoToText(userSeconds)){
        1 -> "$firstMassage ${secToHour(agoToText(userSeconds))}"
        2 -> "$firstMassage $minutes ${minutes(minutes)} ${secToHour(agoToText(userSeconds))}"
        3 -> "$firstMassage $hours ${hours(hours)} ${secToHour(agoToText(userSeconds))}"
        else -> "$firstMassage ${secToHour(agoToText(userSeconds))}"
    }
    println(textInform)
}

    fun agoToText (sec: Int) = when (sec){
    in 0..60 -> 1
    in 61..60*60 -> 2
    in 60 * 60 + 1 .. 24 * 60 * 60 -> 3
    in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> 4
    in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> 5
    else -> 6
}
fun secToHour (period: Int) = when (period){
    1 -> "только что"
    2 -> "назад"
    3 -> "назад"
    4 -> "вчреа"
    5 -> "позавчера"
    else -> "давно"
}
fun minutes (minutes: Int): String {
    val n = minutes % 100
    val n1 = n % 10
    if (n in 11..19) return "минут"
    else if (n1 in 2..4) return "минуты"
    else if (n1 == 1) return "минуту"
    else return "минут"
}
fun hours (hours: Int): String{
    val n = hours % 100
    val n1 = n % 10
    if (n in 11..19) return "часов"
    else if (n1 in 2..4) return "часа"
    else if (n1 == 1) return "час"
    else return "часов"
}

