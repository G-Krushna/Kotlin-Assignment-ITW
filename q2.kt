/* 2. Custom Setter: Write a class Thermostat with a var temperature: Double. Give it a 
private set so it can only be modified from within the class. */

class Thermostat {

    var temperature: Double = 25.0
        private set

    fun updateTemperature(newTemp: Double) {
        temperature = newTemp
    }
}

fun main() {
    val thermostat = Thermostat()

    thermostat.updateTemperature(30.0)

    println("Temperature: ${thermostat.temperature}")
}
