/* 12. Higher-Order Function: Write a function executeTwice(action: () -> Unit) that simply calls 
the passed-in actionlambda two times in a row. */

fun executeTwice(action: () -> Unit) {

    action()
    action()
}

fun main() {

    executeTwice {
        println("Hello Kotlin")
    }
}
