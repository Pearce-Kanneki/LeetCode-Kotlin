package q07

/**
 * No.704
 */
class `Binary Search` {

    fun search(nums: IntArray, target: Int): Int {

        var right = nums.size - 1
        var left = 0
        while (left <= right) {
            (left + (right - left) / 2).also {
                if (nums[it] == target) return it
                else if (nums[it] > target) right = it - 1
                else left = it + 1
            }
        }

        return -1
    }
}