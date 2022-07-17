package q03

/**
 * No.389
 */
class `Find the Difference` {

    fun findTheDifference(s: String, t: String): Char {

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