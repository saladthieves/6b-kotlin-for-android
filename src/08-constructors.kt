// Class definition with properties defined inside the primary constructor
class Phone(
    var make: String,
    var model: String,
    var price: Double
) {
    // inner property defined inside the class
    var description: String

    // Init block, initializing the description property
    init {
        description = "$make, $model, $price"
    }
}

// Class definition without a primary constructor
class Product {

    // inner properties
    var quantity: Int
    var price: Double

    // secondary constructor, used to initialize the inner properties using the parameters
    constructor(quantity: Int, price: Double) {
        this.quantity = quantity
        this.price = price
    }
}

fun main() {

}