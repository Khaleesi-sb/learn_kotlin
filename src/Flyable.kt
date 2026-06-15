interface Flyable {
    fun canFly()
    fun hasWings(){ // we can define default methods in interface
        println("Yes")
    }
}

interface Build{
    fun material()
}

abstract class Vehicle{
    fun hasEngine(){
        println(true)
    }

    open fun hasWings(){
        println("May be")
    }

    abstract fun move()
}

class Aeroplane : Flyable, Build, Vehicle(){ // can implement multiple interfaces but only one abstract class together
    override fun canFly() { // reason is abstract class has more power in inheritance hierarchy compared to interfaces
        println(true) // because: an abstract class tell what the can is but interface says what is can do, and it can have multiple capabilities
    } // interface class = capability, abstract class = identity

    override fun material() {
        println("Metal")
    }

    override fun move(){
        println("Moving...")
    }

    override fun hasWings(){
        println("No")
        super<Flyable>.hasWings()
    }
}

fun main(){
    val indigo = Aeroplane()
    indigo.hasEngine()
    indigo.hasWings()
}

