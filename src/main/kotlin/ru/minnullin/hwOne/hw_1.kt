package ru.minnullin.hwOne

fun main() {
    //стоимость продаж
    val amount: Float = 100f
    val total: Float = 1001f
    val exclusive:Boolean=true
    val fee:Float= CalculeteFee(amount, total, exclusive)
    print("Сумма за вычетом налога = ${amount-fee}.Ваш налог составляет $fee");
}

fun CalculeteFee(amount: Float, total: Float, exclusive: Boolean): Float {
    val exclusiveSale:Float=if(exclusive){
        0.05f
    }else
        0f
    return (when {
        total > 50000 ->
            amount * (0.15 - exclusiveSale)
        total > 10000 ->
            amount * (0.2 - exclusiveSale)
        total > 1000 ->
            amount * (0.25 - exclusiveSale)
        else -> amount * 0.30
    }).toFloat()
}