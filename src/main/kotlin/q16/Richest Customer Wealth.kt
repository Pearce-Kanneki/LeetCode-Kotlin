package q16

/**
 * No.1672
 */
class `Richest Customer Wealth` {

    /**
     *
     */
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = 0
        for(account in accounts) {
            var sum = 0
            for (rev in account){
                sum += rev
            }
            if(max < sum)
                max = sum
        }
        return max
    }

    /**
     * 一行解
     */
    fun maximumWealth1(accounts: Array<IntArray>): Int {
        return accounts.map { it.sum() }.max() ?: 0
//        return accounts.maxOfOrNull { it.sum() } ?: 0
    }
}