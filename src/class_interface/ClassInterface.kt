package class_interface

fun main() {
    val item = Item("Book", 10_000)
    println("Item name is ${item.name}, price is ${item.price}")

    item.buy()
    item.sell()
}

private class Item(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}

interface ItemTrade {
    fun buy()
    fun sell()
}