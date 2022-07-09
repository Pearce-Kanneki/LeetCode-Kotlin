package q03

/**
 * No.303
 */
class `Range Sum Query - Immutable`(val nums: IntArray) {

    /**
     * 較快解
     */
    val sums = mutableListOf<Int>()

    init {
        initSums()
    }

    fun sumRange(left: Int, right: Int): Int {
        return if (left == 0) sums[right] else sums[right] - sums[left -1]
    }

    fun initSums() {
        var sum = 0
        nums.forEach {
            sum += it
            sums.add(sum)
        }
    }


    /**
     * 較簡短的解
     */

    fun sumRange2(left: Int, right: Int): Int {

        var sum = 0
        for (i in left..right) {
            sum += nums[i]
        }

        return sum
    }

}

