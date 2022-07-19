package q04

/**
 * No.476
 */
class `Number Complement` {

    fun findComplement(num: Int): Int {

        var tmp = num
        var q = 0

        while (tmp > 0) {
            q = (q shl 1) or 1
            tmp = tmp shr 1
        }

        return num xor q
    }
}