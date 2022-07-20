package q04

/**
 * No.496
 */
class `Next Greater Element I` {

    /**
     * 較快的解
     */
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val indexHashTable = hashMapOf<Int, Int>()
        for (i in 0 until nums2.size) {
            indexHashTable[nums2[i]] = i
        }

        val results = IntArray(nums1.size)
        for (i in 0 until nums1.size) {
            val index = indexHashTable[nums1[i]]!!
            results[i] = searchNextGreaterElement(nums2, index, nums1[i])
        }
        return results
    }

    private fun searchNextGreaterElement(num: IntArray, startIndex: Int, value: Int): Int {
        for (i in startIndex until num.size) {
            if (num[i] > value) {
                return num[i]
            }
        }
        return -1
    }

    /**
     *
     */
    fun nextGreaterElement1(nums1: IntArray, nums2: IntArray): IntArray {

        val result = HashMap<Int, Int>()
        val check = mutableListOf<Int>()
        for (i in nums2.size - 1 downTo 0) {
            if (i == nums2.lastIndex) result[nums2[i]] = -1
            else {
                check.find { it > nums2[i] }?.let {
                    result[nums2[i]] = it
                } ?: run { result[nums2[i]] = -1 }
            }

            check.add(0, nums2[i])
        }

        val ref = IntArray(nums1.size)
        nums1.forEachIndexed { index, item ->
            ref[index] = result[item] ?: -1
        }

        return ref
    }
}