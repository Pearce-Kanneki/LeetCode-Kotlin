package q13

/**
 * No.1309
 */
class `Decrypt String from Alphabet to Integer Mapping` {

    fun freqAlphabets(s: String): String {
        val ans = StringBuffer()
        var index = s.length - 1
        while (index >= 0) {
            if (s[index] == '#') {
                (s.substring(index - 2, index).toInt() - 1).also {
                    ans.append('a' + it)
                }
                index -= 3
            } else {
                (s[index].toString().toInt() - 1).also {
                    ans.append('a' + it)
                }
                index--
            }
        }

        return ans.reverse().toString()
    }
}