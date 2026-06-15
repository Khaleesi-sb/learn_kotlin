// show your intention to get inherited in the class by putting open
open class Coding(var r : Int){ // primary constructor
    private var rank : Int = 0
    private var lang : String = ""
    init {
        rank = r
        println(rank)
    }
    constructor(rank : Int, lang : String) : this(rank){ // secondary constructor
        this.rank = rank
        this.lang = lang
    }
    open fun run(){ // open for overridden
        println("$rank is running")
    }
}

fun main(){
    val coding = Coding(10, "Java")
    coding.run()
    val alien : Coding = Alien(2)
    alien.run()
}
