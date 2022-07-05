package q02

/**
 * No.217
 */
class `Contains Duplicate` {

    /**
     * 快
     */
    fun containsDuplicate(nums: IntArray): Boolean {

        val hashtable=HashMap<Int,Int>()
        val hasduplicate=false
        for(i in nums)
        {
            if(hashtable.containsKey(i))
            {
                return true
            }else
            {
                hashtable[i] = 1
            }

        }
        return hasduplicate

    }

    /**
     * 中等
     */
    fun containsDuplicate1(nums: IntArray): Boolean {

        val set = mutableSetOf<Int>()
        for (item in nums) {

            if (set.contains(item)) {
                return true
            }
            set.add(item)
        }
        return false
    }

    /**
     * 慢但很省
     */
    fun containsDuplicate2(nums: IntArray): Boolean {

        val check = mutableListOf<Int>()
        nums.forEach {item ->
            if (check.any { it == item }) {
                return true
            } else {
                check.add(item)
            }
        }
        return false
    }
}