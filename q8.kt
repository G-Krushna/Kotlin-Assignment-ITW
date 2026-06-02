/* 8. Singleton: Write an object Database with a fun connect() that prints "Connected to DB". */

object Database {

    fun connect() {
        println("Connected to DB")
    }
}

fun main() {

    Database.connect()
}
