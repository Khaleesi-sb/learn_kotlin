abstract class Animals {
    abstract fun canWalk()
    fun talk(){
        println("talking")
    }
}

class Lions : Animals(){
    override fun canWalk() {
        println("yes can hunt and kill")
    }
}

class Dogs : Animals(){
    override fun canWalk() {
        println("Yes can run also")
    }
}

fun main() {
    val indie : Animals = Dogs()
    indie.talk()
}