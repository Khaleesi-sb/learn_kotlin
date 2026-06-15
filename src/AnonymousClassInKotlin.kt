interface AnonymousClassInKotlin {
    fun example()
}

fun main() {
    var a : AnonymousClassInKotlin = object : AnonymousClassInKotlin{
        override fun example() {
            println("Anonymous inner class example of interface")
        }
    }
    var b : Another = object : Another(){
        override fun example() {
            println("Anonymous inner class example of interface")
        }
    }
}

open class Another{
    open fun example(){
        println("ABC...")
    }
}