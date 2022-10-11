fun main(){

    val freeTransferLimitForCard = 0..75_000
    val maxCardLimitForDay = 150_000
    val maxCardLimitForMoth = 600_000
    val maxVkLimitForMoth = 40_000
    val maxVkLimitForOne = 15_000
    val sumOfTransfer = sum
    var sum: Int = 0
    val cardName = "Maestro"
    val transferAmount = 10_000
    cardTransfer(cardName,transferAmount,maxCardLimitForDay,maxCardLimitForMoth,maxVkLimitForOne,maxVkLimitForMoth,
        sum, freeTransferLimitForCard)

}

fun cardTransfer (cardName: String, transferAmount: Int,dayLimit: Int, mothLimit: Int, limitVkOne: Int,
                  limitVkMoth: Int, sum: Int, freeTransferLimit: IntRange) = when (cardName) {
                      "VK Pay" -> if (transferAmount <= limitVkOne && sum <= limitVkMoth) {sum += transferAmount }
                          else ->

}

fun commissionPercent (cardName: String)  = when (cardName) {
    "Maestro" -> 0.6
    "Mastercard" -> 0.6
    "Visa" -> 0.75
    "Мир" -> 0.75
    else -> 0.0
}

fun additionalCommission (cardName: String)  = when (cardName) {
    "Maestro" -> 20.0
    "Mastercard" -> 20.0
    else -> 0.0
}