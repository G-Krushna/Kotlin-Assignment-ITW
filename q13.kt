/* 13. Filter: Create a listOf(1, 2, 3, 4, 5). Write a one-liner using .filter { } to create a new list 
containing only the even numbers. */

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    val evenNumbers = numbers.filter {
        it % 2 == 0
    }

    println(evenNumbers)
}
