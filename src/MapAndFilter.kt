fun main() {
     val values = listOf(4, 5, 6, 7)
    values.filter { it%2==0 }.map{ it*2 }.forEach(:: println)
}