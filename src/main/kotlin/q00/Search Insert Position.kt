package q00

/**
 * No.35
 */
class `Search Insert Position` {

    fun searchInsert(nums: IntArray, target: Int): Int {

        var result = 0
        for (i in nums.indices) {

            if (nums[i] == target) return i
            if (target > nums[i]) result = i + 1 else break
        }

        return result
    }
}