// Open keyword means this class can be extended
open class Account(val balance: Double) {

    // Open keyword means the function can be overridden in subclasses
    open fun calculate() {
        println(balance)
    }
}

// Savings class extends the Account class, passing in its own property for the super constructor
class Savings(val amount: Double) : Account(amount) {

    // override keyword mandatory to override the function
    override fun calculate() {
        println(amount + balance)
    }
}

// Checking class extends the Account class, passing in its own parameter for the super constructor
class Checking(amount: Double) : Account(amount) {
    override fun calculate() {
        super.calculate()       // calls Account.calculate() superclass function
    }
}

// Balance class with a single inner property named amount
class Balance {
    var amount: Double = 0.0
        // A custom getter property only possible on an internal property
        get() {
            println("Reading the amount...")
            return 0.0
        }
        private set // default implementation for a setter, made private
}


class Bank {
    var checking: Double = 0.0
        private set

    var savings: Double = 0.0
        private set

    var balance: Double
        get() {
            return checking + savings
        }
        set(value) {
            checking += value * 0.25
            savings += value * 0.75
        }
}

fun main() {
    val bank = Bank()
    bank.balance = 400.0
    println("Checking: ${bank.checking}")
    println("Savings: ${bank.savings}")
    println("Total: ${bank.balance}")
}