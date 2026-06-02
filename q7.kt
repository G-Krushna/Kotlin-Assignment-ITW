/* 7. The Copycat: Instantiate a User from the previous question. Write one line of code using 
.copy() to create a new user with the exact same ID and username, but set isActive to false. */

data class User(
    val id: Int,
    val username: String,
    val isActive: Boolean
)

fun main() {

    val user1 = User(1, "G.KRUSHNA", true)

    val user2 = user1.copy(isActive = false)

    println(user1)
    println(user2)
}
