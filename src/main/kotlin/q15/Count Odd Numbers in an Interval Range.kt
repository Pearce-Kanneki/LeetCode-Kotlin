package q15

/**
 * No.1523
 */
class `Count Odd Numbers in an Interval Range` {

    fun countOdds(low: Int, high: Int): Int {
        var count = high - low + 1

        if (count % 2 != 0 && (high % 2 != 0 || low % 2 != 0)){
            ++count
        }

        return count / 2
    }
}