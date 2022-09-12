package q12

/**
 * No.1221
 */
class `Split a String in Balanced Strings` {

    fun balancedStringSplit(s: String): Int {
        var ans = 0
        var i = 0
        while (i < s.length) {
            var j = i + 1
            var score = if (s[i] == 'L') 1 else -1
            while (j < s.length && score != 0)
                score += if (s[j++] == 'L') 1 else -1

            i = j
            ans++
        }

        return ans
    }
}