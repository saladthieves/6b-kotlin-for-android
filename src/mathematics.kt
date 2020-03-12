open class Operation(val left: Double, val right: Double) {
    open fun calculate() {
        // Add implementation in subclasses
    }
}

class Add

class Subtract

class Divide

class Multiply