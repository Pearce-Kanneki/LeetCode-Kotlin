package q02

/**
 * No.242
 */
class `Valid Anagram` {

    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false
        if (s == t) return true
        val result = IntArray(26)
        for (i in s.indices) {
            result[s[i] - 'a']++
            result[t[i] - 'a']--
        }

        return result.none { it != 0 }
    }

    /**
     * one line
     * 但有點慢
     */
    fun isAnagram2(s: String, t: String): Boolean {

        return s == t || s.toList().sorted() == t.toList().sorted()
    }
}