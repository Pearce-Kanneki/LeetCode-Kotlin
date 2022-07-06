package q02

/**
 * No.231
 */
class `Power of Two` {

    /**
     * one line
     * 又很快
     */
    fun isPowerOfTwo(n: Int) = (n > 0) && (n and n - 1) == 0

    fun isPowerOfTwo1(n: Int): Boolean {
        return n > 0 && n.toString(2).reversed().toDouble() == 1.0
    }

    fun isPowerOfTwo2(n: Int): Boolean {

        if (n <= 0) return false
        var result = n
        while (result > 1) {
            if (result % 2 > 0) return false
            result = result ushr 1
        }

        return true
    }
}