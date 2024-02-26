package if_when

fun main() {

    when (val price: Int = 250) {
        in 100..199 -> println("1. price = $price")
        in 200..299 -> println("2. price = $price")
        in 300..399 -> println("3. price = $price")
        else -> println("4. Not")
    }
}