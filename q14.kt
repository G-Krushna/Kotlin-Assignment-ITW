/* 14. Map: Create a listOf("apple", "banana"). Write a one-liner using .map { } to create a new list 
containing the lengthsof those strings. */

fun main() {

    val fruits = listOf("apple", "banana")

    val lengths = fruits.map {
        it.length
    }

    println(lengths)
}
