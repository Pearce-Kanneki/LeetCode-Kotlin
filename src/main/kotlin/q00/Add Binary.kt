package q00

/**
 * No.67
 */
class `Add Binary` {

    fun Char.toIntNumber() = if (this == '1') 1 else 0

    fun addBinary(a: String, b: String): String {
        var aLen = a.length - 1
        var bLen = b.length - 1
        var carry = 0
        val result = StringBuilder()

        while (aLen >= 0 || bLen >= 0) {
            var sum = carry
            if (aLen >= 0) sum += a[aLen--].toIntNumber()
            if (bLen >= 0) sum += b[bLen--].toIntNumber()

            carry = sum / 2
            result.insert(0, sum % 2)
        }
        if (carry >= 1) result.insert(0, 1)

        return result.toString()
    }

    fun addBinary1(a: String, b: String): String {
        val maxlen = if (a.length >= b.length) a else b
        val minlen = if (a.length < b.length) a else b
        var overflow = 0
        var result = ""

        for (i in 1..maxlen.length) {
            val tmp = if (minlen.length - i < 0) 0 else minlen[minlen.length - i].toIntNumber()
            val sum = maxlen[maxlen.length - i].toIntNumber() + tmp + overflow

            overflow = if (sum > 1) 1 else 0
            result = if (sum % 2 ==0) "0$result" else "1$result"
        }

        if (overflow == 1) result = "1$result"

        return result
    }
}