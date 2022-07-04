package q01

/**
 * No.169
 */
class `Majority Element` {

    /**
     * 較快的解
     */
    fun majorityElement(nums: IntArray): Int {
        if (nums.isEmpty()) return -1

        var count = 0
        var major = nums[0]

        for (i in 1 until nums.size) {
            val num = nums[i]

            if(num == major){
                count++
            }else{
                if(count > 0){
                    count--
                } else {
                    count = 0
                    major = num
                }
            }
        }

        return major
    }

    /**
     * 較快的解,炫
     */
    fun majorityElement1(nums: IntArray): Int {
        val size = nums.size / 2
        val set = hashSetOf<Int>()

        nums.forEachIndexed lit@ { index, value ->
            var count = 0
            if (value in set) return@lit
            for (j in index until nums.size) {
                if (value == nums[j]) count++
            }
            if (count > size) return value
            if (value !in set) { set.add(value) }
        }

        return 0
    }

//    fun majorityElement3(nums: IntArray): Int {
//
//        if(nums.size == 1) return nums[0]
//        val minIndex = if (nums.size % 2 > 0) nums.size / 2 + 1 else nums.size /2
//
//        val result = HashMap<Int, Int>()
//
//        for (i in nums) {
//            result[i] = (result[i] ?: 0) + 1
//
//            if ((result[i] ?: 0) > minIndex) {
//                return i
//            }
//        }
//
//        return result.maxBy { it.value }?.key ?: 0
//    }

    /**
     * 改良版
     */
    fun majorityElement4(nums: IntArray): Int {

        var count = 0
        var result = nums[0]

        for (i in 1 until nums.size) {

            if (nums[i] == result) {
                count++
            } else if (count > 0) {
                count --
            } else {
                result = nums[i]
            }

        }

        return result
    }
}