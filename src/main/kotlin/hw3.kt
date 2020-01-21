fun main() {
    val publishedAgo = 543210

    val minutes: Int = publishedAgo/60
    val hours: Int = minutes/60
    val days: Int = hours/24
    val weeks: Int = days/7
    val months: Int = days/30
    val years: Int = months/12

    val result = when {
        years > 0 -> "$years лет"
        months > 0 -> "$months месяцев"
        weeks > 0 -> "$weeks недель"
        days > 0 -> "$days дней"
        hours > 0 -> "$hours часов"
        minutes > 0 -> "$minutes минут"
        else -> "меньше минуты"
    }

    println("Запись сделана $result назад")
}