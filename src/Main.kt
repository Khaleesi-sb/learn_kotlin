fun main() {
    val alien = Alien()
    println("Hello World!")
    alien.name = "Harry"
    println("name is : ${alien.name}")

    val human = Human()
    human.name = "Potter"
    println("name is : ${human.name}")

    println(add(5, 6))
    println(maxAmongTwo(5, 6))
    compareString("Shilpa", "Shilpa")

    // null safety
    val str : String? = null
    var jadu : Alien? = Alien()
    jadu = null
    println(jadu?.name) // ? name if jadu is not null
    println(str ?: "something...") // ?: if null, use right operator

    // switch alternative
    switchStatement(5)
    switchStatement(2)

    // when expression
    whenExpression(3)

}

fun add(a : Int, b : Int) : Int{
    return a+b
}

fun maxAmongTwo(a : Int, b : Int) : Int{
    val result = if(a>b) a else if(b > a) b else -1
    return result
}

fun compareString(s : String, b : String){
    if(s==b) println("same")
    else println("not same")
}

fun switchStatement(n : Int){
    when(n){
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        else -> print("whatever")
    }
}

fun whenExpression(n : Int){
    val res = when(n){
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "whatever"
    }
    println(res)
}

