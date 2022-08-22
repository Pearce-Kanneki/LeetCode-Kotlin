package q09

/**
 * No.977
 */
class `Squares of a Sorted Array` {

    /**
     * 一行解
     */
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { it * it }.sorted().toIntArray()
    }

    /**
     * 概念
     */
    fun sortedSquares1(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var index = result.lastIndex
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val leftNum = nums[left] * nums[left]
            val rightNum = nums[right] * nums[right]
            if (leftNum > rightNum) {
                result[index--] = leftNum
                left++
            } else {
                result[index--] = rightNum
                right--
            }
        }

        return result
    }
}