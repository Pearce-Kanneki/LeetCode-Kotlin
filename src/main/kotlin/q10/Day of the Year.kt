package q10

/**
 * No.1154
 */
class `Day of the Year` {

    fun dayOfYear(date: String): Int {
        val d = date.split('-').map { it.toInt() }
        val md = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30)
        var sum = 0
        for (i in 0 until d[1]) {
            sum += md[i]
        }

        return d[2] + sum + if (d[1] > 2 && d[0] > 1900 && d[0] % 4 == 0) 1 else 0
    }
}