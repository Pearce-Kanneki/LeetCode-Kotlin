package q08

/**
 * No.896
 */
class `Monotonic Array` {

    /**
     *
     */
    fun increasing(A: IntArray): Boolean {
        for (i in 0 until A.size - 1) if (A[i] > A[i + 1]) return false
        return true
    }

    fun decreasing(A: IntArray): Boolean {
        for (i in 0 until A.size - 1) if (A[i] < A[i + 1]) return false
        return true
    }

    fun isMonotonic(nums: IntArray): Boolean {
        return increasing(nums) || decreasing(nums)
    }

    /**
     *
     */
    fun isMonotonic1(nums: IntArray): Boolean {

        if (nums.size <= 2) return true

        var asc: Boolean? = null
        for (i in 1 until nums.size) {
            val d = nums[i] - nums[i - 1]
            if (d == 0) continue
            else if (asc == null) asc = d > 0
            else if (asc != d > 0) return false
        }

        return true
    }
}