package q09

/**
 * No.976
 */
class `Largest Perimeter Triangle` {

    /**
     *
     */
    fun largestPerimeter1(nums: IntArray): Int {

        nums.sortDescending()
        for (i in 2 until nums.size) {
            val sum = nums[i - 1] + nums[i]
            if (nums[i - 2] < sum)
                return sum + nums[i - 2]
        }

        return 0
    }
}