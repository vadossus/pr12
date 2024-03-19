import kotlinx.coroutines.*

open class Class1 {
    fun Input(): Int
    {
        try
        {
            println("Введите, сколько раз будет повторятся выпечка пирожных: ")
            var number = readLine()!!.toInt()
            if (number > 0)
                return number
            else
                println("Число должно быть больше больше нуля! Автоматом вам вручается число 1")
            return 1
        }
        catch (ex:Exception)
        {
            println("Ошибка: ${ex.message}")
            return 0;
        }
    }

    suspend fun BakeCakes(listPirozhnix: MutableList<String>) {
        var vkys: String
        do {
            println("Введите вкус пирожного (если вы хотите завершить напишите 'Выход')")
            vkys = readLine()!!.toString()
            if (vkys != "Выход")
            {
                listPirozhnix.add(vkys)
                println("Добавлено пирожное со вкусом: $vkys")
            }
        }  while (vkys != "Выход")
        for (vkys in listPirozhnix)
        {
            println("Готовим $vkys пирожное")
            delay(2000)
            println("Пирожное $vkys выпекается")
            delay(2000)
            println("Пирожное $vkys готово!")
        }
    }
}