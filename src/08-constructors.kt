// Class with a primary constructor and a property initialized using the init block
class Phone(var make: String, var model: String, var price: Double) {   // properties defined inside the constructor
    // Inner property, defined inside the class
    var description: String

    init {
        description = "$make, $model, $price"
        println("Init complete")
    }
}

// Class without a primary constructor
class Product {

    // Properties defined inside the class
    var quantity: Int
    var price: Double

    // Secondary constructor, that takes in parameters and initializes the properties using the parameters
    constructor(quantity: Int, price: Double) {
        this.quantity = quantity
        this.price = price
    }
}

fun main() {
    val phone = Phone("iPhone", "8", 0.0)
    println(phone.description)
}
