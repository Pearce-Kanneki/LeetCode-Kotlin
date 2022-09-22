package q18

/**
 * No.1822
 */
class `Sign of the Product of an Array` {

    /**
     *
     */
    fun arraySign(nums: IntArray): Int {
        var sign = 1
        for (number in nums) {
            if (number == 0) return 0
            if (number<0) sign *= -1
        }
        return sign
    }

    /**
     *
     */
    fun arraySign1(nums: IntArray): Int {
        var sum = 0
        for (item in nums) {
            if (item == 0) return 0
            else if (item < 0) sum++
        }

        return if (sum % 2 == 0) 1 else -1
    }
}