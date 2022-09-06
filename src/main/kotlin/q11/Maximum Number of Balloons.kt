package q11

/**
 * No.1189
 */
class `Maximum Number of Balloons` {

    /**
     *
     */
    fun maxNumberOfBalloons(text: String): Int {
        val hash = hashMapOf('a' to 0, 'b' to 0, 'l' to 0, 'n' to 0, 'o' to 0)

        for (c in text) if (hash.containsKey(c)) hash[c] = hash[c]!!.plus(1)

        var result = hash['a']!!
        hash['l'] = hash['l']!! / 2
        hash['o'] = hash['o']!! / 2
        for (v in hash.values) if (v < result) result = v

        return result
    }

    /**
     *
     */
    fun maxNumberOfBalloons1(text: String): Int {
        val count = hashMapOf(
            'b' to 0, 'a' to 0, 'l' to 0, 'o' to 0, 'n' to 0
        )

        for (i in text.indices) {
            if (count.containsKey(text[i]))
                count[text[i]] = count.getOrDefault(text[i], 0) + 1
        }

        var ans = Int.MAX_VALUE
        for ((k,v) in count) {
            val d = if (k == 'l' || k == 'o') 2 else 1
            ans = minOf(ans, v / d)
            if (ans == 0) return 0
        }

        return ans
    }
}