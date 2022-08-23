package q10

/**
 * No.1009
 */
class `Complement of Base 10 Integer` {

    fun bitwiseComplement(n: Int): Int {

        if (n == 0) return 1
        var checkNum = n
        var q = 0

        while (checkNum > 0) {
            q = (q shl 1) or 1
            checkNum = checkNum shr 1
        }

        return n xor q
    }
}