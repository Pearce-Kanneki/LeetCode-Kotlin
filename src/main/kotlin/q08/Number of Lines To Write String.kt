package q08

/**
 * No.806
 */
class `Number of Lines To Write String` {

    fun numberOfLines(widths: IntArray, s: String): IntArray {

        var a = 0
        var b = 0
        for (c in s) {
            val t = widths[c - 'a']
            if (b + t > 100 && ++a >= 0) b= t
            else b += t
        }
        if (b != 0) a++

        return intArrayOf(a, b)
    }
}