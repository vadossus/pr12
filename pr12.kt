import kotlinx.coroutines.*

suspend fun main(): Unit = coroutineScope {
    var repositori = mutableListOf<Repositori>()
    repeat(4) {
        val reposit = Repositori.Input();
        repositori.add(reposit)
        repositori.sortByDescending { it.count }
    }
    println("")
    println("Репозитории:")
    repositori.forEach {
        println("")
        println("Репозиторий: ${it.name_reposit}")
        println("Количество репозиториев: ${it.count}")
        println("Пароль: ${it.pass}")
        println("")
    }


}