/* 20. Async: Inside a runBlocking block, write code using async { } to calculate 5 + 5 and then 
use .await() to print the result. */

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val result = async {

        5 + 5
    }

    println(result.await())
}
