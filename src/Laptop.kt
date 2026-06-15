// A data class is nothing but a normal class that by default has
// 1. toString
// 2. equals and hashCode
// 3. copy method
data class Laptop(val brand: String, val price: Int){
    fun show(){
        println("<3")
    }
}

fun main() {
    val laptop1 = Laptop("Asus", 5000)
    val laptop2 = Laptop("HP", 6000)

    val laptop3 = laptop1.copy()
    val laptop4 = Laptop(laptop1.brand, 5000)
    val laptop5 = Laptop(laptop1.copy().brand, 5000)
    val laptop6 = laptop2.copy(price = 1000)

    println(laptop5==laptop4)
    println(laptop2)
    println(laptop3.show())
    println(laptop6.toString())
}


