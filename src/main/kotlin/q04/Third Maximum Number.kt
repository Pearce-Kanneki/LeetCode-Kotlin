package q04

/**
 * No.414
 */
class `Third Maximum Number` {

    fun thirdMax(nums: IntArray): Int {

        val set = nums.toSet().sortedDescending()
        if (set.size < 3) return set[0]
        return set[2]
    }
}