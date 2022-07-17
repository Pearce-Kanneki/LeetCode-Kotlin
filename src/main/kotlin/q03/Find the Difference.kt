package q03

/**
 * No.389
 */
class `Find the Difference` {

    /**
     * 較快的解
     */
    fun findTheDifference(s: String, t: String): Char {
        val sum1 = s.sumOfChars()
        val sum2 = t.sumOfChars()
        return Math.abs(sum1 - sum2).toChar()
    }

    inline fun String.sumOfChars() : Int {
        var sum = 0
        for (c in this){
            sum += c.toInt()
        }
        return sum
    }

    /**
     *
     */
    fun findTheDifference1(s: String, t: String): Char {

        val check = HashMap<Char, Int>()

        s.forEach {
            check[it] = (check[it] ?: 0) + 1
        }

        for (i in t.indices) {
            if (check[t[i]] == null || check[t[i]] == 0) return t[i]
            else check[t[i]] = (check[t[i]] ?: 1) - 1
        }

        return ' '
    }
}