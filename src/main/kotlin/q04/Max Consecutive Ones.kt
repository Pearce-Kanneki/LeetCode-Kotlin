package q04

/**
 * No.485
 */
class `Max Consecutive Ones` {

    /**
     * 較快的解
     */
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var ans = 0
        var count = 0
        for(i in nums) {
            if(i == 1) {
                count++
                if(ans < count) ans = count
            } else {
                count = 0
            }
        }
        return ans
    }

    /**
     *
     */
    fun findMaxConsecutiveOnes1(nums: IntArray): Int {

        var count = 0
        var maxCount = Int.MIN_VALUE
        nums.forEach {
            if (it == 0) {
                maxCount = maxOf(count, maxCount)
                count = 0
            } else {
                count++
            }
        }

        return maxOf(maxCount, count)
    }
}