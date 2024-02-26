package if_when

fun main() {

    val price: Int = 101

    if (price in arrayOf(100, 200, 300)) {
        println("contained")
    } else {
        println("not contained")
    }
}