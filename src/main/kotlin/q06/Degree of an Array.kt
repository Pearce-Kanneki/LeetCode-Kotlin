package q06

/**
 * No.697
 */
class `Degree of an Array` {

    fun findShortestSubArray(nums: IntArray): Int {
        val map = HashMap<Int, MutableList<Int>>()
        nums.forEachIndexed { index, it ->
            if (map.containsKey(it)) {
                map[it]?.set(0, (map[it]?.get(0) ?: 0) + 1)
                map[it]?.set(2, index)
            } else {
                map[it] = mutableListOf(1, index, index)
            }
        }

        var maxNum = 0
        var minLen = 0
        map.forEach { (_, list) ->
            if (maxNum < list[0]) {
                maxNum = list[0]
                minLen = list[2] - list[1] + 1
            } else if (maxNum == list[0]) {
                if (minLen > list[2] - list[1] + 1) {
                    minLen = list[2] - list[1] + 1
                }
            }
        }

        return minLen
    }
}