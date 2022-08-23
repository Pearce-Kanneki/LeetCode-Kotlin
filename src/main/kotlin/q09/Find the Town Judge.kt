package q09

/**
 * No.997
 */
class `Find the Town Judge` {

    /**
     * 較快的解
     */
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        if (n == 1 && trust.size == 0) return 1
        val person = IntArray(n+1) {0}
        for (t in trust) {
            person[t[0]] = Integer.MIN_VALUE
            person[t[1]]++
        }
        for (i in person.indices) {
            if (person[i] == n-1)
                return i
        }
        return -1
    }

    /**
     *
     */
    fun findJudge1(n: Int, trust: Array<IntArray>): Int {
        val count = IntArray(n)
        trust.forEach {
            count[it[0] - 1]--
            count[it[1] - 1]++
        }

        return if (count.contains(n - 1)) count.indexOf(n - 1) + 1 else -1
    }
}