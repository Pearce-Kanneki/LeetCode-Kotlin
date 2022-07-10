package q07

import kotlin.math.min

/**
 * No.746
 */
class `Min Cost Climbing Stairs` {

    /**
     * 其他方法都差不多,這邊就不再贅述
     */

    fun minCostClimbingStairs(cost: IntArray): Int {

        val result = mutableListOf<Int>(cost[0], cost[1])
        if (cost.size >= 3) {
            for (i in 2 until cost.size) {
                val sum = minOf(result[i - 2], result[i - 1]) + cost[i]
                result.add(sum)
            }
        }

        return min(result.last(), result[result.lastIndex - 1])
    }
}