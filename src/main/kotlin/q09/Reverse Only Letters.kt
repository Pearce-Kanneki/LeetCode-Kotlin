package q09

/**
 * No.917
 */
class `Reverse Only Letters` {

    fun reverseOnlyLetters(s: String): String {

        var result = s.toCharArray()
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (checkLetters(result[left]) && checkLetters(result[right])) {
                val tmp = result[left]
                result[left] = result[right]
                result[right] = tmp
                left++
                right--
            }

            if (!checkLetters(result[left])) left++
            if (!checkLetters(result[right])) right--
        }

        return String(result)
    }

    private fun checkLetters(x: Char): Boolean {
        return (x - 'a' >= 0 && x -'a' < 26) || (x - 'A' >= 0 && x -'A' < 26)
    }
}