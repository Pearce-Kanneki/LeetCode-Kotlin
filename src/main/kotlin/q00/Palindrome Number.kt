package q00

/**
 * No.9
 */
class `Palindrome Number` {

    fun isPalindrome(x: Int): Boolean {
        if (x != Math.abs(x)) return false

        var result = 0
        var tmpNumber = x

        while (tmpNumber > 0) {
            result = result * 10 + (tmpNumber % 10)
            tmpNumber /= 10
        }

        return x == result
    }

    /**
     * 參考別人提的方案,一行解決
     */
    fun isPalindrome2(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
}