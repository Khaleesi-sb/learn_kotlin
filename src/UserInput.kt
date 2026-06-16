import java.util.Scanner
import java.util.function.Consumer

fun userInput() {
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    println(num)
    // alternatively
    val input = readln()
    println(input)
}

fun main(){
    userInput()

    // arrays
    val arr = intArrayOf(55, 6, 8, 9, 9)
    // higher order function
    arr.forEach { println(it) }
    arr[1] = 0
    println(arr.last())
    for(i in arr){
        println(i)
    }
    var s : Set<Int> = arr.toSet()
    s.contains(9)
    val arr3 = arr.plus(1).toSet()
    for(i in arr3){
        println(i)
    }
    val arr2 = IntArray(5) // array with size 5
    for(i in 0..<5){
        arr2[i] = -8
    }
    for(i in arr2){
        println(i)
    }

    var arr4 = arrayOfNulls<String>(5)

    val arr5 = arrayOf<String>("o", "k")
    arr5.forEach { println(it) } // "it" is a keyword in case we don't pass variable name
    arr5.forEach { t -> println(t) } // else use a variable name
    arr.forEach(:: println) // :: method reference

    // list
    val values = listOf<String>("", "hh") // listOf is immutable. i.e, you can not add element further
    println(values.last())
    val consumer = Consumer<String>{t -> println(t)}
    values.forEach(consumer)
    val myList = mutableListOf("Harry")
    myList.add("potter")
    println(myList.size)
    var myList1 : MutableList<Float> = mutableListOf()
}