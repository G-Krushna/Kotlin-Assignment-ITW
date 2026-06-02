/* 22. The Exhaustive State Machine: 
Expand on your ScreenState sealed class from Question 10 by adding an Error(val 
errorMsg: String) state. Then, write a function fun renderUI(state: ScreenState) that uses 
an exhaustive when expression to print a specific message for all three possible states. */

sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

data class Error(val errorMsg: String) : ScreenState()

fun renderUI(state: ScreenState) {

    when (state) {

        is Loading ->
            println("Loading data...")

        is Success ->
            println("Success: ${state.data}")

        is Error ->
            println("Error: ${state.errorMsg}")
    }
}

fun main() {

    renderUI(Loading)

    renderUI(Success("Profile Loaded"))

    renderUI(Error("Network Failure"))
}
