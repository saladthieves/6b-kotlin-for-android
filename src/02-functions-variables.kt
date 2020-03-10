// The showName() function using a block body
fun showName() {
    println("Egide Muhire")
}

// The showHeight() function using an expression body
fun showHeight() = println("Height: 165")

fun main() {
    showName()
    showHeight()

    val info = formatInfo("Egide", "Muhire", 165.0)
    println(info)

    // Invoking a function with a backtick name
    `endeit neh?`()
}

// The formatInfo() function using an expression body. It is too long to read this way
fun formatInfo(firstName: String, fathersName: String, height: Double) =
    "Name: $fathersName, $firstName. Height: $height"


// Using backtick ` characters around a function name name with spaces in it.
// Also works with variables, class names and other things.
fun `endeit neh?`() {
    println("Dehna negn")
}