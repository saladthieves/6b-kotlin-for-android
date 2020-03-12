class Shop(val name: String, val address: String)

fun main() {
    val name = "Kidus Super Market"
    val address = "W-02, Bole, Addis Abeba"

    val shop = Shop(name, address)
    println(shop)
}