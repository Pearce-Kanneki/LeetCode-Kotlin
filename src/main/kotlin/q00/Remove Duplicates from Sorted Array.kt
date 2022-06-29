package q00

/**
 * No.26
 */
class `Remove Duplicates from Sorted Array` {

    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size <= 1) return nums.size

        var sum = 0
        nums.forEachIndexed { index, item ->
            if (index == 0 || nums[index - 1] != item) {
                nums[sum] = item
                sum++
            }
        }

        return sum
    }
}