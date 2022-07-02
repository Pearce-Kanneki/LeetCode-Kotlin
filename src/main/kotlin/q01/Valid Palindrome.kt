package q01

/**
 * No.125
 */
class `Valid Palindrome` {

    /**
     * 最快解
     */
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            if (!s[i].isLetterOrDigit()) {
                i++
                continue
            }
            if (!s[j].isLetterOrDigit()) {
                j--
                continue
            }
            if (!s[i].equals(s[j], ignoreCase = true)) {
                return false
            }
            i++
            j--
        }
        return true
    }

    /**
     * 一行解
     */
    fun isPalindrome1(s: String) = s.filter { it.isLetterOrDigit() }.run { equals(reversed(), true) }

    fun isPalindrome2(s: String): Boolean {

        val checkString = s.toLowerCase().filter {
            it in 'a'..'z' || it in '0'..'9'
        }
        if (checkString.isBlank()) return true
        var checkNumber = checkString.length % 2 ==0

        for (i in 0..(checkString.length / 2)) {

            if (i == checkString.length / 2) {
                if (checkNumber) {
                    return checkString[i] == checkString[i - 1]
                }
                return true
            }

            if (checkString[i] != checkString[checkString.length -i - 1]) {
                return false
            }
        }

        return true
    }
}

