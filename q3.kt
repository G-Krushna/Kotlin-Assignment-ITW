/* 3. Inheritance: Create an open class Vehicle with a function startEngine(). Create a 
Motorcycle subclass that inherits from it and overrides startEngine() to print "Vroom!". */

open class Vehicle {

    open fun startEngine() {
        println("Engine Started")
    }
}

class Motorcycle : Vehicle() {

    override fun startEngine() {
        println("Vroom!")
    }
}

fun main() {

    val bike = Motorcycle()

    bike.startEngine()
}
