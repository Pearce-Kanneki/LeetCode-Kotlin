package q08

/**
 * No.821
 */
class `Shortest Distance to a Character` {

    fun shortestToChar(s: String, c: Char): IntArray {
        val result = IntArray(s.length){ 0 }
        var leftIndex = -1
        for (i in s.indices) {
            if (s[i] == c) {
                for (j in (leftIndex + 1) until i){
                    result[j] = if (leftIndex < 0) i - j
                    else Math.min(j - leftIndex, i - j)
                }
                leftIndex = i
            }
        }

        if (s.last() != c) {
            for (i in leftIndex + 1 until s.length){
                result[i] = i - leftIndex
            }
        }

        return result
    }
}