package q00

/**
 * No.69
 */
class `Sqrt(x)` {

    /**
     * 他人解
     */
    fun mySqrt(x: Int): Int {
        var y = x.toDouble()
        while (y * y - x > 0.001) {
            y -= (y * y - x) / (2 * y)
        }

        return y.toInt()
    }

    /**
     * 他人解
     */
    fun mySqrt1(x: Int): Int {
        if (x < 2) return x

        var left = 2
        var right = x / 2

        while (left <= right) {
            val mid = left + (right - left) / 2
            val sqrd: Long = mid.toLong() * mid.toLong()

            if (sqrd > x) {
                right = mid - 1
            } else if (sqrd < x) {
                left = mid + 1
            } else {
                return mid
            }
        }

        return right
    }

    // Newton's method
    fun mySqrt2(x: Int): Int {

        if (x < 2) return x

        var ans = if (x / 2L > 65535) 65535 else (x / 2L)

        while (ans * ans > x || (ans + 1) * (ans + 1) <= x) {
            ans = (ans + x / ans) / 2L
        }

        return ans.toInt()
    }
}