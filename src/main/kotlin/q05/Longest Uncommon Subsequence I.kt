package q05

/**
 * No.521
 */
class `Longest Uncommon Subsequence I` {

    // 這題題目敘述很難理解
    fun findLUSlength(a: String, b: String): Int {

        if (a == b) return -1
        return Math.max(a.length, b.length)
    }
}