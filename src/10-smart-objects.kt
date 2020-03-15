// Defining data class to have toString(), equals() and hashCode() automatically implemented
data class Shop(val name: String, val address: String)

fun main() {
    val name = "Kidus Super Market"
    val address = "W-02, Bole, Addis Abeba"

    val shop = Shop(name, address)
    println(shop)       // Displays properly formatted toString() object

    val operation: Operation = Add(20.0, 30.0)
    if (operation is Add) {
        operation.add()
    }

    // Using a when statement with automatic casting
    when (operation) {
        is Add -> operation.add()
        is Subtract -> operation.subtract()
        is Multiply -> operation.multiply()
        is Divide -> operation.divide()
    }

    // Showing and modifying the singleton
    State.connected = false
    println("State: ${State.connected}")

    State.connected = true
    println("State: ${State.connected}")

    // Calling a function inside a companion object
    Database.connect()              // Indirectly, through the parent class name
    Database.Helper.connect()       // Directly, through the companion object name

    // Invoking the connect() function, and passing in an object expression (anonymous class in Java)
    connect(object: Callback {
        override fun connected() {
            println("Database successfully connected")
        }
    })
}

// Using the object keyword to define and create a singleton
object State {
    var connected = true
}

// Using the object keyword to create a companion object
class Database {
    companion object Helper {   // name is optional
        fun connect() {
            println("Connecting to database...")
            println("Connected")
        }
    }
}

// Interface definition for a simple callback object
interface Callback {
    fun connected()
}

// Function that takes in a Callback object
fun connect(callback: Callback) {
    println("Connecting...")
    println("Connected.")
    callback.connected()
}