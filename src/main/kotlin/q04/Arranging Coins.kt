package q04

/**
 * No.441
 */
class `Arranging Coins` {

    /**
     * 較快的解
     */
    fun arrangeCoins(n: Int): Int {
        var stairs = 1
        var num = n
        while (num>=stairs) {
            num-=stairs
            stairs++
        }
        return stairs-1
    }

    /**
     *
     */
    fun arrangeCoins1(n: Int): Int {
        var index = 1
        var sum = n
        while (sum > index) {
            sum -= index
            index++
        }

        return if (sum == index) index else index - 1
    }
}