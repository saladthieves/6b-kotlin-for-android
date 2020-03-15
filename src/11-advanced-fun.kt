data class Player(val username: String, var highScore: Int = 0)

fun Player.win() {
    highScore++
}

fun Player.lose() {
    highScore -= if (highScore > 0) 1 else 0
}

fun Int.isNegative() = this < 0

infix fun Int.መደመር(a: Int) {
    println(this + a)
}

fun main() {
    val player = Player("abebek")

    player.lose()
    player.win()
    player.win()
    println(player.highScore)

    val range = 30.downTo(1).step(4)
}