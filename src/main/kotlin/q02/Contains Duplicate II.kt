package q02

/**
 * No.219
 */
class `Contains Duplicate II` {

    /**
     * 快
     */
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val lastIndices = mutableSetOf<Int>()
        for (i in nums.indices) {
            val lastK = i - k - 1
            if (lastK >= 0) lastIndices.remove(nums[lastK])

            val num = nums[i]
            if (lastIndices.contains(num)) return true
            lastIndices.add(num)
        }
        return false
    }

    /**
     * 中等
     */
    fun containsNearbyDuplicate1(nums: IntArray, k: Int): Boolean {

        val map = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, item ->
            if (map.contains(item) && index - (map[item] ?: 0) <= k) {
                return true
            } else {
                map[item] = index
            }
        }

        return false
    }

    /**
     * 很慢但很省
     */
    fun containsNearbyDuplicate2(nums: IntArray, k: Int): Boolean {

        if (k == 0) return false
        val list = mutableListOf<Int>()
        for (item in nums) {
            if (list.none { it == item }) {
                if (list.size >= k) {
                    list.removeAt(0)
                }
                list.add(item)
            } else {
                return true
            }
        }

        return false
    }
}