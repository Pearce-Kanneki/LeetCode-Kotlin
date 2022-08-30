package q10

/**
 * No.1128
 */
class `Number of Equivalent Domino Pairs` {

    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val map = HashMap<Pair<Int,Int>, Int>()
        var ans = 0
        dominoes.forEach {
            val item = if (it[0] < it[1]) Pair(it[0], it[1]) else Pair(it[1], it[0])
            map.getOrDefault(item, 0).also { value ->
                ans += value
                map[item] = value + 1
            }
        }

        return ans
    }
}