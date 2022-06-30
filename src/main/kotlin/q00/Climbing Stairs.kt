package q00

import kotlin.math.pow
import kotlin.math.sqrt

/**
 * No.70
 */
class `Climbing Stairs` {

    /**
     * 參考別人解
     */
    fun climbStairs(n: Int): Int {

        if (n == 0) return 0
        if (n == 1) return 1

        var a = 0
        var b = 1
        var aux = 0
        for (i in 1..n){
            aux = a
            a = b
            b = aux + b
        }
        return b
    }


    /**
     * 參考別人解
     */
    val cache = IntArray(46)
    fun climbStairs1(n: Int): Int {

        return when(n) {
            1 -> 1
            2 -> 2
            3 -> 3
            else -> {
                if (cache[n] != 0) return cache[n]
                cache[n] = climbStairs(n-1) + climbStairs(n-2)
                return cache[n]
            }
        }
    }

    /**
     * 費氏數列 (Fibonacci Sequence)
     *  需要n+1
     */
    fun climbStairs2(n: Int): Int {

        val a = 1 / sqrt(5.0)
        val b = ((1 + sqrt(5.0)) / 2f).pow(n + 1.0)
        val c = ((1 - sqrt(5.0)) / 2f).pow(n + 1.0)

        return (a * (b - c)).toInt()
    }
}