package q06

import kotlin.math.min

/**
 * No.696
 */
class `Count Binary Substrings` {

    /**
     * one line
     */
    fun countBinarySubstrings(s: String) =
        s.replace("10", "1 0")
            .replace("01", "0 1")
            .split(' ')
            .asSequence()
            .map{it.length}
            .zipWithNext{l, r -> min(l, r)}
            .sum()

    /**
     *
     */
    fun countBinarySubstrings1(s: String): Int {
        var ptr = 0
        var last = 0
        var ans = 0
        while (ptr < s.length) {
            val c = s[ptr]
            var count = 0
            while (ptr < s.length && s[ptr] == c) {
                ++ptr
                ++count
            }
            ans += minOf(count, last)
            last = count
        }

        return ans
    }
}