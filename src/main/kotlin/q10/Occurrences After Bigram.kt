package q10

/**
 * No.1078
 */
class `Occurrences After Bigram` {

    fun findOcurrences(text: String, first: String, second: String): Array<String> {
        val list = text.split(" ")
        if (list.size < 3) return arrayOf()
        var ans = arrayOf<String>()
        for (i in 2 until list.size) {
            if (list[i - 2] == first && list[i - 1] == second) {
                ans += list[i]
            }
        }

        return ans
    }
}