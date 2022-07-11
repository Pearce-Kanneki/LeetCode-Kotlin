package q03

/**
 * No.326
 */
class `Power of Three` {

    /**
     * 最快解
     */
    fun isPowerOfThree(n: Int): Boolean {
        return ((n > 0) && (1162261467 % n == 0))
    }

    /**
     * 別人寫不錯的解
     */
    fun isPowerOfThree1(n: Int): Boolean {
        var n1 = n
        if (n < 1) {
            return false;
        }

        while (n1 % 3 == 0) {
            n1 /= 3
        }

        return n1 == 1
    }

    fun isPowerOfThree2(n: Int): Boolean {

        if (n <= 0) return false

        var result = n
        while (result > 1) {
            if (result % 3 != 0) return false
            result /= 3
        }

        return true
    }

}