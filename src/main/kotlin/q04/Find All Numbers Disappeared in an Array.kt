package q04

/**
 * No.448
 */
class `Find All Numbers Disappeared in an Array` {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {

        val result = MutableList<Int>(nums.size + 1){it}
        nums.forEach {
            result[it] = 0
        }
        result.removeAll { it == 0 }

        return result
    }
}