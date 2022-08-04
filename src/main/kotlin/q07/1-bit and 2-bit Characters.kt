package q07

/**
 * No.717
 */
class `1-bit and 2-bit Characters` {

    fun isOneBitCharacter(bits: IntArray): Boolean {
        var idx = 0
        while (idx < bits.size - 1) {
            idx += if (bits[idx] == 0) 1 else 2
        }

        return idx == bits.size - 1
    }
}