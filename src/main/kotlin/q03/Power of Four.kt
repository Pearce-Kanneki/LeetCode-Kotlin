package q03

/**
 * No.342
 */
class `Power of Four` {

    fun isPowerOfFour(n: Int): Boolean {

        if (n <= 0) return false
        var result = n

        while (result % 4 == 0) {
            result /= 4
        }

        return result == 1
    }

    /**
     * 暴力解法?
     * 別人寫的
     */
    fun isPowerOfFour1(n: Int): Boolean {
        if (n < 1) return false
        /*var reduced = n
        while (reduced > 1) {
            if (reduced%4 > 0) return false
            reduced /= 4
        }
        return true*/

        //01011011011011011011011011011011 -> 1533916891
        //00100100100100100100100100100100 -> 613566756 1073741824
        return when (n) {
            1,4,16,64,256,1024,4096,16384,65536,262144,1048576,4194304,16777216,67108864,268435456,1073741824 -> true
            else -> false
        }
    }
}