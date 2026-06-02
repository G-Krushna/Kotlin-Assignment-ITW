/* 17. Let: Given val input: String? = "Kotlin", write a safe .let { } block using the ? operator that 
prints the length of the string only if it is not null. */

fun main() {

    val input: String? = "Kotlin"
    //val input: String? = null
  
    input?.let {

        println("Length: ${it.length}")
    }
    println("Program Ended")
}
