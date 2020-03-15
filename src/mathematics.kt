open class Operation(val left: Double, val right: Double)

class Add(left: Double, right: Double) : Operation(left, right) {
    fun add() {
        println("$left + $right = ${left + right}")
    }
}

class Subtract(left: Double, right: Double) : Operation(left, right) {
    fun subtract() {
        println("$left - $right = ${left - right}")
    }
}

class Divide(left: Double, right: Double) : Operation(left, right) {
    fun divide() {
        println("$left / $right = ${left / right}")
    }
}

class Multiply(left: Double, right: Double) : Operation(left, right) {
    fun multiply() {
        println("$left / $right = ${left / right}")
    }
}