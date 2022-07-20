package q04

/**
 * No.492
 */
class `Construct the Rectangle` {

    fun constructRectangle(area: Int): IntArray {

        for (i in Math.sqrt(area.toDouble()).toInt() downTo 2) {
            if (area % i == 0) return intArrayOf(area / i, i)
        }

        return intArrayOf(area, 1)
    }
}