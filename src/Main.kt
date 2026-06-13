fun main() {
    val alien = Alien()
    println("Hello World!")
    alien.name = "Harry"
    println("name is : ${alien.name}")

    val human = Human()
    human.name = "Potter"
    println("name is : ${human.name}")

    println(add(5, 6))
    println(div(10, 2))
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
    // ranges
    val num = 1 .. 15
    for(a in num){
        println(a) // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
    }
    val revNum = 16 downTo 1
    for(a in revNum){
        println(a) // 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
    }
    for(a in revNum step 3){
        println(a) /// 16 13 10 7 4 1
    }
    val revNum2 = 16.downTo(1)
    for(a in revNum2){
        println(a)
    }
    val num2 = 1..< 16 // 1 to 15
    println(num2.reversed())
    println(num2.count())
    val characterRange = 'a' .. 'z'
    println(characterRange.contains('s'))
    // Lists
    var list = listOf(1, 2, 5, 8)
    println(list[0])
    for((i, e) in list.withIndex()){
        println("index is $i and element is $e");
    }
    // Maps
    val map = HashMap<String, Int>()
    map["harry"] = 55
    map["potter"] = 10
    for((name, age) in map){
        var a : Int = map.getOrDefault("harry", 22)
        println("$name : $age")
    }
    calculateAmount(50)
    calculateAmount(amount = 60)
    // string conversion
    val s = "4"
    var n : Int = Integer.parseInt(s)
    n = s.toInt()
    n++
    println(n)
}

fun add(a : Int, b : Int) : Int{
    return a+b
}

// inline function
fun div(a : Int, b : Int) : Int = a/b

fun maxOfTwo(a: Int, b : Int) : Int = a.coerceAtLeast(b)

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


