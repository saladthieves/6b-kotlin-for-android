fun main() {
    // Creating and storing range (IntRange) from 1 to 30 to reuse it
    val selasa = 1..30

    // Iterating over an IntRange range using a for loop
    for (i in selasa) {
        println(i)
    }

    // Iterating over an IntProgression range using a for loop with a step of 2
    for (i in selasa step 2) {
        println(i)
    }

    // Iterating over an IntProgression range in reverse using a for loop
    for (i in 30 downTo 1) {
        println(i)
    }
}

val numbers = '0'..'9'
fun isNumeric(a: String) {
    for (c in a) {
        if (c !in numbers) {
            println("'$a' is not numeric")
            break
        }
    }
}

val alphabet = 'a'..'z'
val capLetters = 'A'..'Z'

fun isLetter(c: Char) = c in alphabet || c in capLetters

fun isAlphabetic(letters: String) {
    for (l in letters) {
        if (!isLetter(l)) {
            println("The string '$letters' does not contain only letters")
            break
        }
    }
}

fun isAlphaNumeric(letters: String) {
    for (c in letters) {
        if (!isLetter(c) && c !in numbers) {
            println("The string '$letters' is not alphanumeric")
            break
        }
    }
}