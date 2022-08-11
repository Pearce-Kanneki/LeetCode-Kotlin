package q08

/**
 * No.804
 */
class `Unique Morse Code Words` {

    fun uniqueMorseRepresentations(words: Array<String>): Int {

        val asc = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
            ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
            "-.--","--.."
        )

        val set = HashSet<String>()

        for (i in words.indices) {
            var tmp = ""
            for (j in words[i].indices) {
                tmp += asc[words[i][j] - 'a']
            }

            set.add(tmp)
        }

        return set.size
    }
}