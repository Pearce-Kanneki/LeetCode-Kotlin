package q10

/**
 * No.1137
 */
class `N-th Tribonacci Number` {

    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        if (n in 1..2) return 1
        var cache = Triple(0,1,1)
        for (i in 3..n){
            cache = Triple(
                first = cache.second,
                second = cache.third,
                third = cache.first + cache.second + cache.third
            )
        }

        return cache.third
    }
}