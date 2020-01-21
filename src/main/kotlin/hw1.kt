fun main() {
    val amount = 9
    val total = 1_000_000
    val fee = calculateFee(amount, total, true)
    println(fee)
}

fun calculateFee(
    amount: Int,
    total: Int,
    exclusive: Boolean = false
) : Float {
    var fee = when {
        total > 50000 -> 15
        total > 10000 -> 20
        total > 1000 -> 25
        else -> 30
    }
    if (exclusive) {
        fee -= 5
    }
    return amount * fee.toFloat()/100
}