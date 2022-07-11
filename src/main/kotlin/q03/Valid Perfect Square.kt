package q03

/**
 * No.367
 */
class `Valid Perfect Square` {

    /**
     *  牛頓法則
     */
    fun isPerfectSquare(num: Int): Boolean {

        if (num == 1) return true
        var ans = if (num / 2L > 65535) 65535 else (num / 2L)
        while (ans * ans > num || (ans + 1) * (ans + 1) <= num) {
            ans = (ans + num / ans) / 2L
        }

        return ans.toInt() * ans.toInt() == num
    }

    fun isPerfectSquare1(num: Int): Boolean {

        val num = num.toLong()
        var x = 1L
        var k = num + 1L

        while (x < k) {
            val j = x + (k - x) / 2

            if (j * j >= num)
                k = j
            else
                x = j + 1
        }

        return x * x == num
    }
}