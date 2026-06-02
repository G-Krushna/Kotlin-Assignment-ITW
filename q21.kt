/* 21. The Map/Filter Combo: 
You have a list of products: val inventory = listOf(Product("Laptop", 1000.0), 
Product("Mouse", 25.0), Product("Keyboard", 60.0)). 
Write a chained collection operation that first uses .map { } to apply a 10% discount to all 
prices, and then uses .filter { } to return only the products that still cost more than $50. */

data class Product(
    val name: String,
    val price: Double
)

fun main() {

    val inventory = listOf(
        Product("Laptop", 1000.0),
        Product("Mouse", 25.0),
        Product("Keyboard", 60.0)
    )

    val result = inventory
        .map {
            Product(it.name, it.price * 0.9)
        }
        .filter {
            it.price > 50
        }

    println(result)
}
