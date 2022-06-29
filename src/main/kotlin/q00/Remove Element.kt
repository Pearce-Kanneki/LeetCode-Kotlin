package q00

/**
 * No.27
 */
class `Remove Element` {

    fun removeElement(nums: IntArray, `val`: Int): Int {

        if (nums.isEmpty()) return 0
        var sum = 0

        nums.forEach {
            if (it != `val`){
                nums[sum++] = it
            }
        }

        return sum
    }
}