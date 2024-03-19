import kotlinx.coroutines.*
import kotlin.concurrent.thread

suspend fun main(){
    val Class = Class1()
    val number = Class.Input()
    val list = mutableListOf<String>()

    val job = GlobalScope.launch {
        for (i in 1..number) {
            println("$i:")
            Class.BakeCakes(list)
        }
    }
    job.join()
}