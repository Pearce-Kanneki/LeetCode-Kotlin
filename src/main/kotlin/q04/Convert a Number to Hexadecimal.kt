package q04

/**
 * No.405
 */
class `Convert a Number to Hexadecimal` {

    /**
     *
     */
    fun toHex(num: Int): String {

        if (num == 0) return "0"
        val map = "0123456789abcdef"
        val sb = StringBuffer()
        var s = num.toUInt()

        while (s > 0u) {
            sb.append(map[(s % 16u).toInt()])
            s /= 16u
        }

        return sb.reverse().toString()
    }
}