package q03

/**
 * No.374
 */
class `Guess Number Higher or Lower` {
    /**
     * The API guess is defined in the parent class.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * fun guess(num:Int):Int {}
     */

    /**
     * 較快的方法
     */
    fun guessNumber(n:Int):Int {
        var left = 0
        var pivot = 0
        var right = n
        while (left <= right) {
            pivot = left + (right - left) / 2
            val g = guess(pivot)
            if (g == 0) break
            else if (g == -1) right = pivot - 1
            else left = pivot + 1
        }
        return pivot
    }

    fun guessNumber1(n:Int):Int {
        var min = 1
        var max = n
        while (min < max) {
            (min + (max - min + 1) / 2).also {
                when(guess(it)) {
                    1 -> min = it + 1
                    -1 -> max = it - 1
                    0 -> {
                        min = it
                        max = it
                    }
                }
            }
        }

        return min
    }

    fun guess(num:Int):Int {return 0}
}