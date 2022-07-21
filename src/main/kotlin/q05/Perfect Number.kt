package q05

/**
 * No.507
 */
class `Perfect Number` {

    /**
     * 這樣也可以嗎?  (☉_☉)
     */
    fun checkPerfectNumber(num: Int): Boolean {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }

    /**
     *
     */
    fun checkPerfectNumber1(num: Int): Boolean {

        if (num == 1) return false
        val count = mutableListOf<Int>()
        for (i in 2 until num) {
            if (num % i != 0) continue
            count.add(i)
            if (count.first() == num / i) break
        }

        return count.sum() + 1 == num
    }
}