package q05

/**
 * No.557
 */
class `Reverse Words in a String III` {

    fun reverseWords(s: String): String {

        val check = s.split(" ")
        val sb = StringBuffer()

        for (i in check.indices) {
            sb.append(check[i].reversed())

            if (i != check.size - 1) {
                sb.append(" ")
            }
        }

        return sb.toString()
    }
}