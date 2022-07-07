package q02

/**
 * No.268
 */
class `Missing Number` {

    /**
     * 快又省
     */
    fun missingNumber(nums: IntArray): Int {
        var result = nums.size
        for (position in nums.indices) {
            result = result xor (position xor nums[position])
        }
        return result
    }

    /**
     * one line
     */
    fun missingNumber1(nums: IntArray): Int {

        return (nums.size * (nums.size + 1) / 2) - nums.sum()
    }

    /**
     * 慢 但好理解
     */
    fun missingNumber2(nums: IntArray): Int {

        nums.sort()
        for (i in nums.indices) {
            if (i != nums[i]) {
                return i
            }
        }

        return nums.size
    }
}