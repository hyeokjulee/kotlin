package if_when

fun main() {

    val price: Int? = 10

    if (price == null) {
        println("null check true")
    } else {
        println("price = $price")
    }
}