package q02

/**
 * No.283
 */
class `Move Zeroes` {

    /**
     * 較快
     */
    fun moveZeroes(nums: IntArray): Unit {

        var index = 0;
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[index] = nums[i]
                index ++
            }

        }

        while (index < nums.size) {
            nums[index] = 0
            index ++
        }
    }

    fun moveZeroes1(nums: IntArray): Unit {

        if (nums.size == 1) return
        val tmp = nums.toMutableList().apply { removeIf { it == 0 } }
        for (i in nums.indices) {
            nums[i] = if (i < tmp.size) tmp[i] else 0
        }
    }
}