class Alien(rank : Int) : Coding(rank, "Dart"){
    var name : String = ""
    var skill : String? = null

    init {
        println("hello")
    }

    fun show(){
        println(skill)
    }

    override fun run(){
        println("run time error ;-)")
    }
}

fun main() {
    val alien = Alien(21)
//    alien.run()
}

// val -> creating a constant variable
// var -> creating object that can be reassigned with different value