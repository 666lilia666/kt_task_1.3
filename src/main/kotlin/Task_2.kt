fun main() {
    val freeTransferLimitForCard = 0..75_000
    val firstTransfer = calculation(10_00, "Visa")
    println(firstTransfer)
}

fun calculation(translation: Int, cardName: String,): Int{
    return (translation + ((translation * commissionPercent(cardName) )/ 100 + additionalCommission(cardName))).toInt()
}



/*fun commissionPercent (cardName: String)  = when (cardName) {
    "Maestro" -> 0.6
    "Mastercard" -> 0.6
    "Visa" -> 0.75
    "Мир" -> 0.75
    else -> 0.0
}*/

/*fun additionalCommission (cardName: String)  = when (cardName) {
    "Maestro" -> 20.0
    "Mastercard" -> 20.0
    else -> 0.0
}*/









