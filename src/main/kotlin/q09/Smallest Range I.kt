package q09

/**
 * No.908
 */
class `Smallest Range I` {

    /**
     *
     */
    fun smallestRangeI(nums: IntArray, k: Int): Int {

        var min=nums[0]
        var max=nums[0]
        for (i in 1 until nums.size) {
            if (nums[i]>max) max=nums[i]
            if (nums[i]<min) min=nums[i]
        }
        var answer=(max-k)-(min+k)
        if (answer<0) answer=0

        return answer
    }

    /**
     *
     */
    fun smallestRangeI1(nums: IntArray, k: Int): Int {
        return maxOf(
            0,
            (nums.max() ?: 0) - (nums.min() ?: 0) - 2 * k
        )
    }
}