package q07

/**
 * No.747
 */
class `Largest Number At Least Twice of Others` {

    /**
     * 較快的解
     */
    fun dominantIndex(nums: IntArray): Int {

        if (nums.size < 2) return 0

        var secondMax = 0
        var max = 0
        var maxIndex = -1
        for (i in nums.indices) {

            if (nums[i] > max) {
                secondMax = max
                max = nums[i]
                maxIndex = i
            } else if (nums[i] > secondMax) {
                secondMax = nums[i]
            }
        }

        return if (secondMax * 2 > max) -1 else maxIndex

        return maxIndex
    }

    /**
     *
     */
    fun dominantIndex1(nums: IntArray): Int {
        if (nums.size == 1) return 0
        var result = Pair(0, 0)
        var index = 0

        for (i in nums.indices) {
            if (nums[i] > result.first) {
                if (result.first > result.second) {
                    result = result.copy(second = result.first)
                }
                index = i
                result = result.copy(first = nums[i])
            } else if (nums[i] > result.second) {
                result = result.copy(second = nums[i])
            }
        }

        return if (result.first >= 2 * result.second) index else -1
    }
}