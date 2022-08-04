package q07

/**
 * No.724
 */
class `Find Pivot Index` {

    fun pivotIndex(nums: IntArray): Int {
        val total = nums.sum()
        var sum = 0
        for (i in nums.indices) {
            if (2 * sum == total - nums[i]) {
                return i
            }
            sum += nums[i]
        }

        return -1
    }
}