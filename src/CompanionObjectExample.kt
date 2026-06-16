class A{
    companion object {
        @JvmStatic var name : String = ""
        @JvmStatic fun show(){
            println(name)
        }
    }
}

fun main() {
    A.name = "h"
}