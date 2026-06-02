/*1. Encapsulation: Write a class BankAccount with a private var balance: Double. Provide 
a public function deposit(amount: Double) that safely adds to the balance. */
class BankAccount {

    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount")
        } else {
            println("Deposit amount must be greater than 0")
        }
    }

    fun showBalance() {
        println("Current Balance: $balance")
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(1000.0)
    account.deposit(-200.0)

    account.showBalance()
}
