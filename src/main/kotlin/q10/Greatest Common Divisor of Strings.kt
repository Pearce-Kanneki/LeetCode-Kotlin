package q10

/**
 * No.1071
 */
class `Greatest Common Divisor of Strings` {

    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1 + str2 != str2 + str1) return ""
        return str1.substring(0, gcd(str1.length, str2.length))
    }

    private fun gcd(x: Int, y:Int): Int {
        var x1 = x
        var y1 = y
        var remainder = x % y
        while (remainder != 0) {
            x1 = y1
            y1 = remainder
            remainder = x1 % y1
        }

        return y1
    }
}