package q08

/**
 * No.860
 */
class `Lemonade Change` {

    fun lemonadeChange(bills: IntArray): Boolean {
        val money = intArrayOf(0,0)
        bills.forEach {

            when(it) {
                5 -> money[0]++
                10 -> {
                    if (money[0] <= 0) return false
                    money[0]--
                    money[1]++
                }
                20 -> {
                    if (money[0] > 0 && money[1] > 0) {
                        money[0]--
                        money[1]--
                    } else if (money[0] >= 3) {
                        money[0] -= 3
                    } else {
                        return false
                    }
                }
            }
        }

        return true
    }
}