fun main() {
    val height = 1.96
    val weight = 77.0

    val index = bodyMassIndex(height, weight)

    val verdict = when {
        index < 16 -> "Выраженный дефицит массы тела"
        index < 18.5 -> "Недостаточная (дефицит) масса тела"
        index < 25 -> "Норма"
        index < 30 -> "Избыточная масса тела (предожирение)"
        index < 35 -> "Ожирение"
        index < 40 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }

    println(verdict)
}

fun bodyMassIndex(
    height : Double,
    weight : Double
) : Double {
return (weight/(height*height))
}