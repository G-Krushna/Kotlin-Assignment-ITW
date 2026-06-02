/* 16. Apply: Create a standard class Window with var width = 0 and var height = 0. Instantiate it 
and chain an .apply { }block to set both dimensions to 1920 and 1080 immediately. */

class Window {

    var width = 0
    var height = 0
}

fun main() {

    val window = Window().apply {

        width = 1920
        height = 1080
    }

    println("Width: ${window.width}")
    println("Height: ${window.height}")
}

/*
//Instead of apply, which basically create and initialize an object, we can use constructor also
class Window(
    var width: Int = 0,
    var height: Int = 0
)

fun main() {

    val window = Window(1920, 1080)

    println("Width: ${window.width}")
    println("Height: ${window.height}")
}
*/
