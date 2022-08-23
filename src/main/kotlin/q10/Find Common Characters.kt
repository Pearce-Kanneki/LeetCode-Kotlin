package q10

import java.util.*

/**
 * No.1002
 */
class `Find Common Characters` {

    /**
     *
     */
    fun commonChars(words: Array<String>): List<String> {
        val result: MutableList<String> = arrayListOf()
        if (words.isEmpty()) return result

        val count = IntArray(26)
        Arrays.fill(count,Int.MAX_VALUE)

        for (word in words) {
            val innerCount = IntArray(26)
            for (c in word) {
                innerCount[c-'a']++
            }
            for (i in 0 until 26) {
                count[i] = Math.min(innerCount[i],count[i])
            }
        }
        for (c in 'a'..'z') {
            while (count[c-'a']-- > 0) {
                result.add("$c")
            }
        }
        return result
    }

    /**
     *
     */
    fun commonChars1(words: Array<String>): List<String> {
        val result = mutableListOf<String>()
        val check = IntArray(26){ Int.MAX_VALUE }
        words.forEach {
            val tmp = IntArray(26)
            for (i in it.indices) {
                tmp[it[i] - 'a']++
            }

            for (i in check.indices) {
                check[i] = minOf(check[i], tmp[i])
            }
        }

        for (i in check.indices) {
            if (check[i] == 0 || check[i] == Int.MAX_VALUE) continue

            repeat(check[i]) {
                result.add(('a' + i).toString())
            }
        }

        return result
    }
}