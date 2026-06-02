/* 25. Polymorphic Higher Order Function: 
Create an abstract class Shape with an abstract fun calculateArea(): Double. Create 
Circle and Square subclasses. Write a Higher-Order Function fun 
processShapes(shapes: List<Shape>, action: (Double) -> Unit). Iterate through the list, 
calculate each area, and pass the result into the action lambda. */

abstract class Shape {

    abstract fun calculateArea(): Double
}

class Circle(
    private val radius: Double
) : Shape() {

    override fun calculateArea(): Double {

        return 3.14 * radius * radius
    }
}

class Square(
    private val side: Double
) : Shape() {

    override fun calculateArea(): Double {

        return side * side
    }
}

fun processShapes(
    shapes: List<Shape>,
    action: (Double) -> Unit
) {

    for (shape in shapes) {

        val area = shape.calculateArea()

        action(area)
    }
}

fun main() {

    val shapes = listOf(

        Circle(5.0),

        Square(4.0)
    )

    processShapes(shapes) {

        println("Area = $it")
    }
}
