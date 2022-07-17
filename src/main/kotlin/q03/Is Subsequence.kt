package q03

/**
 * No.392
 */
class `Is Subsequence` {

    /**
     * 較快的解
     */
    fun isSubsequence(s: String, t: String): Boolean {
        if (s.length > t.length) {
            return false
        }

        var sIndx = 0
        var tIndx = 0

        while ((sIndx < s.length) && (tIndx < t.length)) {
            if (s[sIndx] == t[tIndx]) {
                sIndx++
            }
            tIndx++
        }

        return sIndx == s.length
    }

    /**
     *
     */
    fun isSubsequence1(s: String, t: String): Boolean {

        var index = 0
        t.forEach {
            if (index >= s.length) return true
            if (s[index] == it) index++
        }

        return index == s.length
    }
}