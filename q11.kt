/* 11. Lambda Syntax: Write a variable val square: (Int) -> Int that holds a lambda function. Use 
the it keyword to return the square of the input number. */

fun main() {

    val square: (Int) -> Int = {
        it * it
    }

    println(square(5))
}
