import java.math.BigInteger

fun main(){
    println(solve(5))
    println(solve2(BigInteger("70000"), BigInteger.ONE))
}

fun solve(n : Int) : Int{
    if(n==0){
        return 1;
    }
    return n * solve(n-1)
}

// tail recursion
tailrec fun solve2(n : BigInteger, result : BigInteger) : BigInteger{
    if(n == BigInteger.ZERO){
        return result;
    }
    return solve2(n-BigInteger.ONE, result*n)
}