package q03

/**
 * No.350
 */
class `Intersection of Two Arrays II` {

    /**
     * 較快方法
     */
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val fr = IntArray(1_001)
        for (n in nums1) fr[n]++

        val list = ArrayList<Int>(1_000)
        for (n in nums2) if (fr[n] > 0) {
            list += n
            fr[n]-- // taken
        }
        return IntArray(list.size) { list[it] }
    }

    /**
     * 
     */
    fun intersect1(nums1: IntArray, nums2: IntArray): IntArray {
        val hm = hashMapOf<Int, Int>()
        val ll = mutableListOf<Int>()
        nums1.forEach{ n ->
            hm.put(n, hm.getOrDefault(n, 0) + 1)
        }
        nums2.forEach{ m ->
            if(hm.containsKey(m) && hm.get(m) != null && hm.get(m)!! > 0) {
                ll.add(m)
                hm.put(m, hm.getOrDefault(m, 0) - 1)
            }
        }
        return ll.toIntArray()
    }

    /**
     *
     */
    fun intersect2(nums1: IntArray, nums2: IntArray): IntArray {

        val set = if (nums1.toSet().size < nums2.toSet().size) nums1.toSet() else nums2.toSet()
        val result = mutableListOf<Int>()
        set.forEach { item ->
            val len1 = nums1.filter { it == item }.size
            val len2 = nums2.filter { it == item }.size
            if (len1 > 0 && len2 > 0) {
                for (i in 1..Math.min(len1, len2)) {
                    result.add(item)
                }
            }
        }

        return result.toIntArray()
    }
}