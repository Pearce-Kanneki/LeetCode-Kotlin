package q01

/**
 * No.121
 */
class `Best Time to Buy and Sell Stock` {

    /**
     * 較快且省資源作法
     */
    fun maxProfit(prices: IntArray): Int {

        var result = 0
        var minNumber = prices[0]

        prices.forEach {
            if (minNumber > it) {
                minNumber = it
            }

            (it - minNumber).run {
                if (result < this) {
                    result = this
                }
            }
        }

        return result
    }

    fun maxProfit1(prices: IntArray): Int {

        var result = 0
        var minNumber = Int.MAX_VALUE

        prices.forEach {

            minNumber = minOf(it, minNumber)
            result = maxOf(result, it - minNumber)
        }

        return result
    }
}