class FactoryDesignPattern {
    companion object{
        fun create(a : String) : FactoryDesignPattern = FactoryDesignPattern()
    }

    fun show(){
        println("in show")
    }
}

fun main(){
    val factoryDesignPattern = FactoryDesignPattern.create("")
    factoryDesignPattern.show()
}