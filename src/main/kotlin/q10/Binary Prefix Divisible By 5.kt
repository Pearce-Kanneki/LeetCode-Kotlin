package q10

/**
 * No.1018
 */
class `Binary Prefix Divisible By 5` {

    /**
     *
     */
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val list = mutableListOf<Boolean>()
        var n = 0

        for (x in nums) {
            n = (2 * n + x) % 5

            if (n == 0)
                list.add(true)
            else list.add(false)
        }

        return list
    }

    /**
     *
     */
    fun prefixesDivBy5_1(nums: IntArray): List<Boolean> {
        val ans = mutableListOf<Boolean>()
        var count = 0
        for (i in nums.indices) {
            count = (count shl 1) + nums[i]
            count %= 5
            ans.add(count == 0)
        }

        return ans
    }
}