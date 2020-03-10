fun main() {

}

// Returns 200 if the username is "Abebe" else, returns 203. Defined as an expression body
fun login(username: String) = if (username == "Abebe") 200 else 203

// Uses a 'when' statement as an expression body to return a HTTP status message given a code
fun getMessage(code: Int) : String =
    when(code) {
        200 -> "OK"
        400 -> {                // branch block
            if (code == 300) {  // if used as expression
                "Error"
            } else {
                "Mistake"
            }
        }
        403 -> "Forbidden"
        else -> "Unknown Code"  // required, since when is an expression
    }

// Uses a 'when' statement without an argument
fun showMessage(code: Int) {
    when {
        code in 200..299 -> println("All Good")
        code in 300..399 -> println("Client Update")
        code in 400..499 -> println("Client Error")
        code in 500..599 -> println("Server Error")
        else -> println("Unknown Error Code")
    }
}