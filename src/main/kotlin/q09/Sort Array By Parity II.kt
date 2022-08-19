package q09

/**
 * No.922
 */
class `Sort Array By Parity II` {

    fun sortArrayByParityII(nums: IntArray): IntArray {

        var odd = 1
        for (even in nums.indices step 2) {
            if (nums[even] % 2 == 1) {
                while (nums[odd] % 2 == 1) {
                    odd += 2
                }
                nums[even] += nums[odd]
                nums[odd] = nums[even] - nums[odd]
                nums[even] -= nums[odd]
            }
        }

        return nums
    }
}