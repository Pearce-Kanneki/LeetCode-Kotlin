package q04

/**
 * No.459
 */
class `Repeated Substring Pattern` {

    fun repeatedSubstringPattern(s: String): Boolean {
        val str = s + s
        return str.substring(1, str.length - 1).contains(s)
    }
}