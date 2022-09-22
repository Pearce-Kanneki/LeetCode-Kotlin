package q17

/**
 * No.1790
 */
class `Check if One String Swap Can Make Strings Equal` {

    fun areAlmostEqual(s1: String, s2: String): Boolean {
        var searchIndex = -1
        for (i in s1.indices) {
            searchIndex = if (s1[i] == s2[i]) continue
            else if (searchIndex == -2) return false
            else if (searchIndex == -1) i
            else {
                if (s1[searchIndex] != s2[i] || s1[i] != s2[searchIndex])
                    return false
                -2
            }
        }

        return searchIndex < 0
    }
}