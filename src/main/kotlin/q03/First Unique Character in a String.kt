package q03

/**
 * No.387
 */
class `First Unique Character in a String` {

    fun firstUniqChar(s: String): Int {

        val check = HashMap<Char, Int>()

        s.forEach {
            check[it] = (check[it] ?: 0) + 1
        }

        for (i in s.indices) {
            if (check[s[i]] == 1) return i
        }

        return -1
    }
}