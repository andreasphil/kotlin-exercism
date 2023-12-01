import kotlin.math.pow

class Squares(private val base: Int) {
    fun sumOfSquares(): Int = (1..base).sumOf { it * it }

    fun squareOfSum(): Int = (1..base).sum().let { it * it }

    fun difference(): Int = squareOfSum() - sumOfSquares()
}
