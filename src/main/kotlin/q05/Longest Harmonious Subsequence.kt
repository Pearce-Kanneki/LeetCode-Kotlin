package q05

/**
 * No.594
 */
class `Longest Harmonious Subsequence` {

    /**
     * 較快的解
     */
    fun findLHS(nums: IntArray): Int {

        val map : HashMap<Int, Int> = hashMapOf()
        var max = 0
        nums.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        map.keys.forEach {
            if( map.contains(it+1)) max = maxOf(max, map[it]!! + map[it+1]!!)
        }


        return max
    }

    /**
     *
     */
    fun findLHS1(nums: IntArray): Int {

        val map = HashMap<Int, Int>()
        var result = 0
        nums.forEach {
            map[it] = (map[it] ?: 0) + 1
        }

        for (i in map.toSortedMap().keys) {
            if (map[i] == null || map[i - 1] == null){
                continue
            }

            ((map[i] ?: 0) + (map[i - 1] ?: 0)).also {
                if (it > result) result = it
            }
        }

        return result
    }
}