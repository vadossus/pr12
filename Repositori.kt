import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class Repositori(val name_reposit: String, val pass: Int, val count: Int) {

    companion object
    {
        suspend fun Input() : Repositori = withContext(Dispatchers.IO)
        {
            print("Введите название репозитория:")
            var name_reposit = readLine()!!.toString()
            print("Введите пароль: ")
            var pass = readLine()!!.toInt();
            print("Сколько у вас репозиториев: ")
            val count = readLine()!!.toInt()
            Repositori(name_reposit,pass,count)
        }
    }

}