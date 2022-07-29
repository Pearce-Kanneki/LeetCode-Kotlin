package q06

/**
 * No.680
 */
class `Valid Palindrome II` {

    /**
     * 較快的方法
     */
    fun validPalindrome(s: String): Boolean {
        return matching(s, 0, s.length - 1, 0)
    }

    fun matching(s: String, left: Int, right: Int, count: Int): Boolean{
        var left = left
        var right = right

        if(count > 1){return false}

        while(left < right){
            if(s[left] == s[right]){
                left++
                right--
            }else{
                return (matching(s, left + 1, right, count+1) || matching(s, left, right -1, count+1))
            }
        }
        return true
    }

    /**
     *
     */
    fun validPalindrome1(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if (s[left] == s[right]) {
                left++
                right--
            } else {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)
            }
        }

        return true
    }

    private fun isPalindrome(s: String, bIndex: Int, eIndex: Int): Boolean {
        var left = bIndex
        var right = eIndex
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}