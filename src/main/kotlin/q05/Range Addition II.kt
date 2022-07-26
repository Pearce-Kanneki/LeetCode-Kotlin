package q05

/**
 * No.598
 */
class `Range Addition II` {

    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        var maxM = m
        var maxN = n
        ops.forEach {
            if (it[0] in 1 until maxM) maxM = it[0]
            if (it[1] in 1 until maxN) maxN = it[1]
        }

        return maxM * maxN
    }
}