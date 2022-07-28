package q06

/**
 * No.645
 */
class `Set Mismatch` {

    /**
     * 較快的方法
     */
    fun findErrorNums(nums: IntArray): IntArray {
        var i = 0
        while(i < nums.size){
            val j = nums[i] -1
            if(nums[i] != nums[j]){
                nums[i] = nums[j].also{ nums[j] = nums[i]}
            } else {
                i++
            }
        }
        for((i, num) in nums.withIndex()){
            if(i != num -1){
                return intArrayOf(num, i+1)
            }
        }
        return intArrayOf()
    }

    /**
     *
     */
    fun findErrorNums1(nums: IntArray): IntArray {
        val result = intArrayOf(0,0)
        val check = IntArray(nums.size) {0}
        var sum = (1 + nums.size) * nums.size / 2

        nums.forEach {
            if (check[it - 1] == 0) {
                sum -= it
                check[it - 1] = 1
            } else {
                result[0] = it
            }
        }

        result[1] = sum

        return result
    }
}