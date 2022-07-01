package q00

/**
 * No.88
 */
class `Merge Sorted Array` {

    /**
     * 較快的解
     */
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i1 = m - 1
        var i2 = n - 1

        while (i1 != -1 || i2 != -1) {
            when {
                i1 == -1 -> nums1[i2] = nums2[i2--]
                i2 == -1 -> return
                nums2[i2] >= nums1[i1] -> nums1[i1 + i2 + 1] = nums2[i2--]
                else -> nums1[i1 + i2 + 1] = nums1[i1--]
            }
        }
    }

    fun merge1(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        val tmp = nums2.plus(nums1.filterIndexed { index, _ -> index < m })
        tmp.sorted().forEachIndexed { index, item ->
            nums1[index] = item
        }
    }

    fun merge2(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var nums1Index = 0
        var nums2Index = 0
        val tmp = nums1.filterIndexed { index, _ -> index < m }

        while (nums1Index < m || nums2Index < n) {

            when {
                nums1Index >= m -> {
                    nums1[nums1Index + nums2Index] = nums2[nums2Index]
                    nums2Index++
                }
                nums2Index >= n -> {
                    nums1[nums1Index + nums2Index] = tmp[nums1Index]
                    nums1Index++
                }
                tmp[nums1Index] <= nums2[nums2Index] -> {
                    nums1[nums1Index + nums2Index] = tmp[nums1Index]
                    nums1Index++
                }
                else -> {
                    nums1[nums1Index + nums2Index] = nums2[nums2Index]
                    nums2Index++
                }
            }
        }
    }
}