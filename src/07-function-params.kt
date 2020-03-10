fun main() {
    callPhone("Abebe", 251, "0985697789")

    callPhone(
        code = 254,
        number = "0783748474",
        name = "Abebe"
    )

    callPhone("Abebe", code = 251)
//    callPhone(name = "Abebe", 251)    // does not work
    callPhone("James")
    callPhone("James", 250)
}

fun callPhone(name: String = "Abebe", code: Int = 251, number: String = "0985000000") {
    println("Calling $name on +$code-${number.substring(1)}...")
}