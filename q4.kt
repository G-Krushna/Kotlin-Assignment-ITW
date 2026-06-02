/* 4. Super Constructor: Write a parent class Employee(val baseSalary: Int). Write a child 
class Manager that inherits from Employee and correctly passes 80000 up to the super 
constructor. */

open class Employee(val baseSalary: Int)

class Manager : Employee(80000)

fun main() {

    val manager = Manager()

    println("Manager Salary: ${manager.baseSalary}")
}
