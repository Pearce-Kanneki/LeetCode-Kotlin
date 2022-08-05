package q07

/**
 * No.748
 */
class `Shortest Completing Word` {

    /**
     * 較快的解
     */
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        var shortestLength = 16
        var answer: String = ""
        val licensePlateList = mutableListOf<Char>()
        for (i in licensePlate.indices) {
            if (licensePlate[i].isLetter()) {
                licensePlateList.add(licensePlate[i].toLowerCase())
            }
        }

        for (word in words) {
            val copiedList = mutableListOf<Char>()
            copiedList.addAll(licensePlateList)
            for (i in word.indices) {
                if (word[i] in copiedList) {
                    copiedList.remove(word[i])
                }
            }
            if (copiedList.isEmpty() && word.length < shortestLength) {
                shortestLength = word.length
                answer = word
            }
        }
        return answer
    }

    /**
     *
     */
    fun shortestCompletingWord1(licensePlate: String, words: Array<String>): String {
        val lic = getCnt(licensePlate)
        var ans: String? = null
        for (s in words) {
            val cur = getCnt(s)
            var checkOk = true
            for (i in  0 until 26) {
                if (lic[i] > cur[i]) {
                    checkOk = false
                    break
                }
            }

            if (checkOk && (ans == null || ans.length > s.length)) ans = s
        }

        return ans ?: ""
    }

    private fun getCnt(str: String): IntArray {
        val cnt = IntArray(26){0}
        str.toLowerCase().forEach {
            if (it.toInt() - 'a'.toInt() in 0..25) {
                cnt[it.toInt() - 'a'.toInt()]++
            }
        }

        return cnt
    }
}