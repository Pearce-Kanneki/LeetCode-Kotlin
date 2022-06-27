package com.kanneki.leetcodekotlin.remove_duplicates_from_sorted_array

class RemoveDuplicates {

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