package q01

import com.jetbrains.rd.util.first

/**
 * No.136
 */
class `Single Number` {

    /**
     * 1 line
     */
    fun singleNumber(nums: IntArray): Int = nums.reduce(Int::xor)

    /**
     * 正統解
     */
    fun singleNumber0(nums: IntArray): Int {
        var n = 0
        for (i in nums) {
            n = n xor i
        }
        return n
    }

    /**
     * 85.94%,86.53%
     */
    fun singleNumber1(nums: IntArray): Int {

        val result = HashMap<Int, Boolean>()
        nums.forEach {
            result[it] = (result[it] == null)
        }

        return result.filter { it.value }.map { it.key }.first()
    }

    /**
     * 爛方法
     */
    fun singleNumber2(nums: IntArray): Int {

        if (nums.size == 1) return nums[0]
        nums.sort()
        for (i in nums.indices) {
            if (i == 0 && nums[i] != nums[1]) {
                return nums[i]
            } else if (i == nums.lastIndex && nums[i] != nums[i - 1]) {
                return nums[i]
            } else if (nums[i] != nums[i +1] && nums[i] != nums[i - 1]) {
                return nums[i]
            }
        }
        return -1
    }
}