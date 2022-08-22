package q09

/**
 * No.961
 */
class `N-Repeated Element in Size 2N Array` {

    fun repeatedNTimes(nums: IntArray): Int {
        val count = HashSet<Int>()
        for (item in nums) {
            if (count.contains(item)) return item
            count.add(item)
        }

        return -1
    }
}
