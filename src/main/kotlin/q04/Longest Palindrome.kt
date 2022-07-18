package q04

/**
 * No.409
 */
class `Longest Palindrome` {

    /**
     * 較快的解
     */
    fun longestPalindrome(s: String): Int {
        var hasPrime = false
        val charMap = mutableMapOf<Char, Int>()
        var wordSize = 0
        for(i in 0 until s.length) {
            val count = charMap.get(s[i]) ?: 0
            charMap.put(s[i], count + 1)
        }
        charMap.values.forEach {
            val isPrime = it % 2 > 0
            if(isPrime && hasPrime) {
                wordSize += it - 1
            } else {
                if(isPrime) { hasPrime = true }
                wordSize += it
            }
        }
        return wordSize
    }

    /**
     *
     */
    fun longestPalindrome1(s: String): Int {

        val check = s.toList().sorted()
        var result = 0
        var m = 0
        var tmp = 1

        var index = 1
        while (index <= check.size) {
            if (index == check.size || check[index - 1] != check[index]) {
                result += tmp - (tmp % 2)
                m = m or (tmp % 2)
                tmp = 1
            } else { tmp++ }

            index++
        }


        return result + m
    }
}