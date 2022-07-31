package q06

import java.util.LinkedList

/**
 * nO.693
 */
class `Binary Number with Alternating Bits` {

    /**
     * 較快的方法
     */
    fun hasAlternatingBits(n: Int): Boolean {
        var bit = n and 1
        var num = n ushr 1
        while (num != 0) {
            if ((num and 1) xor bit != 1) {
                return false
            }
            bit = num and 1
            num = num ushr 1
        }

        return true
    }

    /**
     *
     */
    fun hasAlternatingBits1(n: Int): Boolean {

        var tmp = n
        var prev = 2
        while (tmp > 0) {
            (tmp % 2).also {
                if (it == prev) return false
                prev = it
            }

            tmp /= 2
        }

        return true
    }
}