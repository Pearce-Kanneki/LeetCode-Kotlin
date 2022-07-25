package q05

/**
 * No.561
 */
class `Array Partition` {

    fun arrayPairSum(nums: IntArray): Int {

        nums.sort()
        var count = 0
        for (i in 0 until nums.size step 2) {
            count += nums[i]
        }

        return count
    }
}