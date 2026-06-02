/* 19. Launch: Inside a fun main() = runBlocking { } block, use launch { } to start a background 
coroutine that prints "Background task finished". */

import kotlinx.coroutines.*

fun main() {
  
    runBlocking {

        launch {
            delay(500)
            println("Background task finished")
        }

    }
    
}
