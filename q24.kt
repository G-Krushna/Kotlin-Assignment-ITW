/* 24. The Builder Pattern (Scope Functions): 
Write a function fun buildFile(filename: String): File. Inside the function, instantiate a File 
object. Chain an .apply { } block to set its permissions to "Read/Write". Then chain an 
.also { } block to log "File $filename created" to the console. Finally, return the configured 
object. */

class File(

    val filename: String
) {

    var permissions = "None"
}

fun buildFile(filename: String): File {

    return File(filename)

        .apply {

            permissions = "Read/Write"
        }

        .also {

            println("File $filename created")
        }
}

fun main() {

    val file = buildFile("report.txt")

    println(file.permissions)
}
