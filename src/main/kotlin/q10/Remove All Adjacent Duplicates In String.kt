package q10

/**
 * No.1047
 */
class `Remove All Adjacent Duplicates In String` {

    fun removeDuplicates(s: String): String {

        val ans = StringBuffer()
        for (i in s.indices) {
            if (ans.isEmpty() || ans.last() != s[i]) {
                ans.append(s[i])
            } else {
                ans.deleteCharAt(ans.lastIndex)
            }
        }

        return ans.toString()
    }
}