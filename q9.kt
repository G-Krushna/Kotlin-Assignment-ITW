/* 9. Companion Object: Write a class IDGenerator. Inside it, create a companion object with a 
variable currentId starting at 0, and a function getNextId() that increments and returns it. */

class IDGenerator {

    companion object {

        private var currentId = 0

        fun getNextId(): Int {
            currentId++
            return currentId
        }
    }
}

fun main() {

    println(IDGenerator.getNextId())
    println(IDGenerator.getNextId())
    println(IDGenerator.getNextId())
}
