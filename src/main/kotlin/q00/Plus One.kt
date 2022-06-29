package q00

/**
 * No.66
 */
class `Plus One` {

    /**
     * 參考別人較快的解
     */
    fun plusOne(digits: IntArray): IntArray {

        if(digits[digits.size - 1] < 9) {
            digits[digits.size - 1] += 1
            return digits
        }

        for(i in digits.size-1 downTo 0) {
            digits[i]++
            if(digits[i] == 10) {
                digits[i] = 0
            } else {
                return digits
            }
        }
        return intArrayOf(1, *digits)
    }

    fun plusOne1(digits: IntArray): IntArray {

        for (i in digits.size.dec() downTo 0) {

            digits[i]++
            if (digits[i] > 9) digits[i] = 0 else return digits
        }

        return IntArray(digits.size.inc()).apply { this[0] = 1 }
    }
}