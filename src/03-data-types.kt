fun main() {

    // Holds a String type, cannot hold a null type
    val name: String = "Abebe"

    // Holds a nullable String, can hold null
    var address: String? = "Bole, Woreda 02, Addis Abeba"
    address = null

    // last declared as a nullable type, from getLast()
    var last = getLast()
    last = null
}

fun getLast() : String? {
    return "Kebede"
}