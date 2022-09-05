package q11

/**
 * No.1160
 */
class `Find Words That Can Be Formed by Characters` {

    fun countCharacters(words: Array<String>, chars: String): Int {
        var sum = 0
        val charsList = IntArray(26){0}
        for (item in chars) {
            charsList[item - 'a']++
        }

        words.forEach {

            val tmp = charsList.clone()
            var wordLen = it.length
            for (i in it.indices) {
                if (--tmp[it[i] - 'a'] < 0) {
                    wordLen = 0
                    break
                }
            }

            sum += wordLen
        }

        return sum
    }
}