package ru.netology

fun main() {
    var flag = -1
    var sumDeal = 0
    var sumFinal = 0
    val percentDiscount = 5
    val percentConstant = 1
    val sumDiscount =100
    val level1Min = 0
    val level1Max = 1_000
    val level2Min = 1_001
    val level2Max = 10_000
    val level3Min = 10_001

    /*
    Условия акции
    Если сумма покупки от 0 до 1 000 рублей, то скидка не предоставляется.
    Если сумма покупки от 1 001 до 10 000 рублей, то скидка составит 100 рублей (как в лекции).
    Если сумма покупки от 10 001 рубля и выше, то скидка составит 5% от суммы.
    Все цены указаны в рублях.
    При этом постоянные пользователи, то есть те, кто покупает ежемесячно, дополнительно получают 1% скидки сверху.
    Важно: скидки не суммируются, а применяются сверху. Например, у пользователя скидка 5%, значит 1% применяется к 95%:
     */

    println("Программа MELOMAN стартовала")
    while (flag == -1) {
        println("Введите сумму покупки: ")
        println("0-Выход из программы")
        var input = readLine().toString().toInt()
        when (input) {
            0 -> {
                flag = 0; break
            }

            else -> {
                if (true) println("Судя по отпечаткам пальцев, Вы постоянный покупатель")
            }
        }
//      println("Расчет процента скидки")
        sumDeal = input
        if ((sumDeal > level1Min) && (sumDeal <= level1Max)) println("Скидка не предоставляется")
        else {
            if ((sumDeal >= level2Min) && (sumDeal <= level2Max)) {
                sumFinal = sumDeal - sumDiscount
                println("Скидка $sumDiscount руб., сумма со скидкой $sumFinal руб.")
                sumDeal=sumFinal
            } else {
                if (sumDeal >= level3Min) run {
                    sumFinal = sumDeal - (sumDeal / 100 * percentDiscount)
                    println("Скидка из-за суммы заказа 5% $sumFinal руб.")
                    sumDeal = sumFinal
                }
            }
            sumFinal = sumDeal - (sumDeal / 100 * percentConstant)
            println("Скидка постоянного покупателя 1% $sumFinal руб.")
        }

    }
    println("Программа MELOMAN завершена.")
}

