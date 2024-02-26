package if_when

fun main() {

    when (val price: Int = 301) {
        100 -> println("1. price = $price")
        200 -> println("2. price = $price")
        300 -> println("3. price = $price")
        else -> println("4. Not")
    }
}