package q03

/**
 * No.338
 */
class `Counting Bits` {

    fun countBits(n: Int): IntArray {

        var result = IntArray(n + 1){0}

        for (i in 1..n) {
            result[i] = result[i ushr 1] + (i and 1)
        }
        return result
    }
}