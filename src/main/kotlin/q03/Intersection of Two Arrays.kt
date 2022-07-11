package q03

/**
 * No.349
 */
class `Intersection of Two Arrays` {

    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

        val set = mutableSetOf<Int>()
        val minArray = if (nums1.size < nums2.size) nums1 else nums2
        val maxArray = if (nums1.size >= nums2.size) nums1 else nums2
        for (i in minArray.indices) {
            if (set.contains(minArray[i])) {
                continue
            }

            if (maxArray.contains(minArray[i])) {
                set.add(minArray[i])
            }
        }

        return set.toIntArray()
    }
}