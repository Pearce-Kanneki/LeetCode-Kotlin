package q03

/**
 * No.383
 */
class `Ransom Note` {

    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        val num = IntArray(26)
        magazine.forEach {
            num[it - 'a']++
        }
        ransomNote.forEach {
            num[it - 'a']--
            if (num[it - 'a'] < 0) return false
        }

        return true
    }
}