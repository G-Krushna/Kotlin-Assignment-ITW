/*
26. The E-Commerce Checkout Pipeline 
Write a complete, executable Kotlin program in a single file that simulates a concurrent 
checkout system. 
Requirements: 
    1. Create a data class CartItem(val name: String, val price: Double, val quantity: 
       Int). 
    2. Write an Extension Function on List<CartItem> called calculateTotal() that 
       multiplies the price by the quantity for each item and returns the sum as a 
       Double. 
    3. Create a Sealed Class called CheckoutResult with three states: Processing, 
       Success(val receiptId: String), and Failed(val reason: String). 
    4. Create a Singleton object PaymentProcessor containing a suspend fun 
       processPayment(cart: List<CartItem>): CheckoutResult. 
          ■ Inside this function, delay for 2 seconds to simulate a network call. 
          ■ Use your extension function to get the cart total. 
          ■ If the total is greater than $1000, return Failed("Insufficient funds for large 
          transaction"). 
          ■ Otherwise, return Success("TXN-${(1000..9999).random()}"). 
    5. In your main function (using runBlocking), create two separate carts (one cheap, 
       one expensive). Use launch to process them concurrently through the 
       PaymentProcessor. Use an exhaustive when statement to print the final outcome 
       of each cart!
*/

import kotlinx.coroutines.*

data class CartItem(
    val name: String,
    val price: Double,
    val quantity: Int
)

// Extension Function
fun List<CartItem>.calculateTotal(): Double {

    var total = 0.0

    for (item in this) {
        total += item.price * item.quantity
    }

    return total
}

// Sealed Class
sealed class CheckoutResult

object Processing : CheckoutResult()

data class Success(
    val receiptId: String
) : CheckoutResult()

data class Failed(
    val reason: String
) : CheckoutResult()

// Singleton Object
object PaymentProcessor {

    suspend fun processPayment(
        cart: List<CartItem>
    ): CheckoutResult {

        println("Processing payment...")

        // Simulate network call
        delay(2000)

        val total = cart.calculateTotal()

        return if (total > 1000) {

            Failed(
                "Insufficient funds for large transaction"
            )

        } else {

            Success(
                "TXN-${(1000..9999).random()}"
            )
        }
    }
}

fun main() {

    runBlocking {

        val cheapCart = listOf(

            CartItem(
                "Mouse",
                25.0,
                2
            ),

            CartItem(
                "Keyboard",
                50.0,
                1
            )
        )

        val expensiveCart = listOf(

            CartItem(
                "Laptop",
                1500.0,
                1
            )
        )

        val cheapCartJob = launch {

            val result =
                PaymentProcessor.processPayment(
                    cheapCart
                )

            when (result) {

                is Processing ->
                    println("Cheap Cart: Processing")

                is Success ->
                    println(
                        "Cheap Cart Success: ${result.receiptId}"
                    )

                is Failed ->
                    println(
                        "Cheap Cart Failed: ${result.reason}"
                    )
            }
        }

        val expensiveCartJob = launch {

            val result =
                PaymentProcessor.processPayment(
                    expensiveCart
                )

            when (result) {

                is Processing ->
                    println("Expensive Cart: Processing")

                is Success ->
                    println(
                        "Expensive Cart Success: ${result.receiptId}"
                    )

                is Failed ->
                    println(
                        "Expensive Cart Failed: ${result.reason}"
                    )
            }
        }

        cheapCartJob.join()
        expensiveCartJob.join()

        println("Checkout Completed")
    }
}
