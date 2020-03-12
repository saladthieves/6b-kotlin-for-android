open class Operation(val left: Double, val right: Double)

class Add(left: Double, right: Double) : Operation(left, right) {
    fun add() {
        println("$left + $right = ${left + right}")
    }
}

class Subtract

class Divide

class Multiply