package q05

/**
 * No.509
 */
class `Fibonacci Number` {

    /**
     * one line
     */
    fun fib(N: Int):Int = if(N<=1) N else fib(N-1)+fib(N-2)

    fun fib1(n: Int): Int {

        if (n == 0) return 0

        var per = 0
        var next = 1
        for (i in 1 until n) {
            val tmp = per + next
            per = next
            next = tmp
        }

        return next
    }
}