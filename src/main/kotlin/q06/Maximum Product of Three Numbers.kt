package q06

/**
 * No.628
 */
class `Maximum Product of Three Numbers` {

    /**
     * 快又省的方法
     */
    fun maximumProduct(nums: IntArray): Int {
        var minus = 100001
        var zero = 100001
        var first = -10001
        var second = -100001
        var third = -101001

        for (i in nums) {
            if (i < minus) {
                zero = minus
                minus = i
            } else if (i < zero) {
                zero = i
            }

            if (i > first) {
                third = second
                second = first
                first = i
            } else if (i > second) {
                third = second
                second = i
            } else if (i > third) {
                third = i
            }
        }

        return Math.max(first * second * third, minus * zero * first)
    }

    /**
     *
     */
    fun maximumProduct1(nums: IntArray): Int {
        nums.sortDescending()
        return Math.max(
            nums[0] * nums[1] * nums[2],
            nums[0] * nums[nums.lastIndex] * nums[nums.lastIndex - 1]
        )
    }
}