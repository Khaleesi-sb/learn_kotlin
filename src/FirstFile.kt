@file: JvmName("First")

fun main(){
    val a = Alien()
    a.name = "harry"
    a.skill = "Development"
    a.show()

    val b = Alien()
    b.name = "voldemort"
    b.skill = "SQL"
    b.show()

    // extension function
    val c = a.plus(b)
    c.show()
    // inline function
    a kills b

    a - 5
}

// extension function operator overloading
infix operator fun Alien.minus(a : Int){
    println("something")
}

// extension function
fun Alien.plus(a : Alien) : Alien{
    val newAlien = Alien()
    newAlien.skill = this.skill + " " + a.skill
    return newAlien
}

// infix function
infix fun Alien.kills(a : Alien){
    println("${this.name} killed ${a.name}")
}

fun dataTypes(){
    println("all the data types including Range")
}

@JvmOverloads
fun calculateAmount(amount : Int, interest: Double = 0.04){
    println((amount + (amount*interest)).toInt())
    calc(secondNum = 5, firstNum = 6)
    calc(11, 50)
}

fun calc(firstNum : Int, secondNum : Int){
    println("first num is $firstNum and second num is $secondNum")
}

fun tryCatch(){
    val str = "5ll"
    var n = 0
    try {
        n = str.toInt()
    } catch (e : NumberFormatException){
        println("Give proper input")
    } finally {
        n++
        println(n)
    }
}

fun tryAsExpression(){
    val str = "5ll"
    var n = try {
        str.toInt()
    } catch (e : NumberFormatException){
        -1
    }
    n++
    println(n)
}

