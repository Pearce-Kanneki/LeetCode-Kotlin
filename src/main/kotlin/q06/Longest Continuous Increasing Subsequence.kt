package q06

/**
 * No.674
 */
class `Longest Continuous Increasing Subsequence` {

    /**
     * 較快的方法
     */
    fun findLengthOfLCIS(nums: IntArray): Int {
        val n = nums.size

        var j = 0
        var ans = 0
        for (i in 1..n-1) {
            if (nums[i] <= nums[i-1]) {
                ans = maxOf(ans, i-j)
                j = i
            }
        }
        ans = maxOf(ans, n-j)

        return ans
    }

    /**
     *
     */
    fun findLengthOfLCIS1(nums: IntArray): Int {
        var maxCount = 0
        var count = 0
        for (i in nums.indices) {
            if (i == 0) count = 1
            else if (nums[i] > nums[i - 1]) count++
            else {
                maxCount = Math.max(maxCount, count)
                count = 1
            }
        }
        maxCount = Math.max(maxCount, count)
        return maxCount
    }
}