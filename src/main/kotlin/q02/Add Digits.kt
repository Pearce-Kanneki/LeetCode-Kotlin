package q02

/**
 * No.258
 */
class `Add Digits` {

    /**
     * one line
     * 很神奇
     */
    fun addDigits(num: Int): Int {
        return (num-1)%9 +1
    }

    fun addDigits1(num: Int): Int {
        // basic
        var result = num
        while (result > 9) {
            result = result.toString().sumBy { it - '0' }
        }

        return result
    }

    fun addDigits2(num: Int): Int {
        // basic
        val result = mutableListOf<Int>()
        var loopNum = num
        while (loopNum > 0) {
            result.add(loopNum % 10)
            loopNum /= 10
        }

        return if (result.sum() < 10) result.sum() else addDigits2(result.sum())
    }
}