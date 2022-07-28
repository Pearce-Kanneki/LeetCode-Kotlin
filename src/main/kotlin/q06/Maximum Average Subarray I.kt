package q06

/**
 * No.643
 */
class `Maximum Average Subarray I` {

    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var count = 0
        for (i in 0 until k) {
            count += nums[i]
        }
        var maxSum = count
        for (i in k until nums.size) {
            count = count - nums[i - k] + nums[i]
            maxSum = Math.max(count, maxSum)
        }

        return maxSum.toDouble() / k
    }
}