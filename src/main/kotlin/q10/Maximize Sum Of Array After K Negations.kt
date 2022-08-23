package q10

/**
 * No.1005
 */
class `Maximize Sum Of Array After K Negations` {

    /**
     * 較快的解
     */
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        val queue = java.util.PriorityQueue<Int>()
        nums.forEach { queue.add(it) }
        var negations = k
        while (negations > 0) {
            val value = queue.poll()
            if (value <= 0) {
                queue.add(-value)
                --negations
            } else {
                if (negations % 2 != 0) {
                    queue.add(-value)
                } else {
                    queue.add(value)
                }
                negations = 0
            }
        }
        var result = 0
        while (!queue.isEmpty()) {
            result += queue.poll()
        }
        return result
    }

    /**
     *
     */
    fun largestSumAfterKNegations1(nums: IntArray, k: Int): Int {
        nums.sort()
        var index = 0
        for (i in k downTo 1) {
            if (index < nums.size && nums[index] < 0) {
                nums[index] *= -1
                index++
            } else if (i % 2 == 1) {
                nums.sort()
                nums[0] *= -1
                break
            } else break
        }

        return nums.sum()
    }
}