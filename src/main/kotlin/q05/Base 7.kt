package q05

/**
 * No.504
 */
class `Base 7` {

    /**
     * 較快的解
     */
    fun convertToBase7(num: Int): String {

        if (num == 0) return "0"
        val sb = StringBuilder()
        var count = Math.abs(num)
        while (count > 0) {
            sb.append(count % 7)
            count /= 7
        }

        if (num < 0) sb.append("-")
        return sb.reverse().toString()
    }

    /**
     * 1行解
     */
    fun convertToBase71(num: Int): String {

        return num.toString(7)
    }
}