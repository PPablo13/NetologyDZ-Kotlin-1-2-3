fun main() {
    var amountOfPur = 101//сумма покупки
    val regularCustomer = true //постоянный покупатель или нет


    var totalPrice:Int = if (amountOfPur in 0..1000) {amountOfPur} //рассчитываем итоговую сумму со скидками
    else (if (amountOfPur in 1001..10_000) {amountOfPur -= 100}
    else {(amountOfPur - (amountOfPur * 0.05)).toInt()}) as Int

    if (regularCustomer) {println("Сумма заказа, с учетом скидок, составляет:" + (totalPrice-(totalPrice*0.01)))}
    //выводим сумму скидки, если гость постоянный (доп.скидка 1% на итоговую сумму со скидками)
    else println("Сумма заказа, с учетом скидок, составляет: $totalPrice")
    //выводим сумму скидки если гость непостоянный

}