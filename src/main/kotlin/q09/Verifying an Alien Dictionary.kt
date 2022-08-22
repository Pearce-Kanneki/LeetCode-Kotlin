package q09

/**
 * No.953
 */
class `Verifying an Alien Dictionary` {

    /**
     *
     */
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        for (i in 1 until words.size) {

            val word1 = words[i - 1]
            val word2 = words[i]

            for (j in word1.indices) {
                if (j >= word2.length) {
                    return false
                }

                if (order.indexOf(word1[j]) > order.indexOf(word2[j])) {
                    return false
                }

                if (word1[j] != word2[j]) {
                    break
                }
            }

        }

        return true
    }

    /**
     *
     */
    fun isAlienSorted1(words: Array<String>, order: String): Boolean {
        val arr = IntArray(26)
        for((idx, c) in order.withIndex())
            arr[c-'a'] = idx

        for(i in 0 until words.size-1){
            val data = Pair(words[i],words[i+1])
            var j = 0
            val minLength = minOf(data.first.length, data.second.length)
            while(j < minLength){
                if(arr[data.first[j]-'a'] > arr[data.second[j]-'a']) return false
                else if(arr[data.first[j]-'a'] < arr[data.second[j]-'a']) break
                j++
            }
            if(j == data.second.length && j < data.first.length) return false
        }

        return true
    }
}