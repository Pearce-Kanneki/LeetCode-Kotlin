package q05

/**
 * No.500
 */
class `Keyboard Row` {

    /**
     * 
     */
    fun findWords(words: Array<String>): Array<String> {

        val map = hashMapOf<Char, Int>()
        val keyboardRows = listOf("qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM")
        for ((i, row) in keyboardRows.withIndex()) {
            for (j in row) { map.put(j, i) }
        }

        val output = ArrayList<String>()
        words.forEach { word ->
            var row = map[word[0]]
            for (letter in 1..word.length - 1) {
                if (map[word[letter]] != row) {
                    row = -1
                    break
                }
            }
            if (row != -1) {
                output.add(word)
            }
        }
        return output.toTypedArray()
    }

    /**
     *
     */
    fun findWords1(words: Array<String>): Array<String> {

        val result = mutableListOf<String>()
        val check = listOf("qwertyuiop","asdfghjkl","zxcvbnm")
        val map = HashMap<Char, Int>()
        check.forEachIndexed { index, item ->
            item.forEach {
                map[it] = index
            }
        }

        words.forEach {item ->
            var tIndex = -1
            for (i in item.toLowerCase()) {
                if (tIndex == -1) tIndex = map[i] ?: 0
                else if (tIndex != map[i]) {
                    tIndex = -1
                    break
                }
            }
            if (tIndex >= 0) result.add(item)
        }

        return result.toTypedArray()
    }
}