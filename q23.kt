/* 23. The Concurrent Downloader: 
Write two suspend functions: fetchUserData() (delays 1000ms, returns "Alice") and 
fetchAppConfig() (delays 2000ms, returns "Dark Mode"). In your main function, use 
async to fetch them both at the exact same time. Await both results and print them. Total 
execution time must be ~2 seconds, not 3. */

import kotlinx.coroutines.*

suspend fun fetchUserData(): String {

    delay(1000)

    return "Alice"
}

suspend fun fetchAppConfig(): String {

    delay(2000)

    return "Dark Mode"
}

fun main() = runBlocking {

    val user = async {
        fetchUserData()
    }

    val config = async {
        fetchAppConfig()
    }

    println("User: ${user.await()}")

    println("Config: ${config.await()}")
}
