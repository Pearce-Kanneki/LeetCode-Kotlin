package q09

/**
 * No.905
 */
class `Sort Array By Parity` {

    /**
     *
     */
    fun sortArrayByParity(nums: IntArray): IntArray {
        var counterEven = 0
        var counterOdd = nums.size-1
        var temp = 0

        while (counterEven < counterOdd) {
            if (nums[counterEven] % 2 == 0) {
                counterEven++
            }
            if (nums[counterOdd] % 2 != 0) {
                counterOdd--
            }

            if ((counterEven < counterOdd)&&nums[counterEven] % 2 != 0 && nums[counterOdd] % 2 == 0) {
                temp = nums[counterEven]
                nums[counterEven] = nums[counterOdd]
                nums[counterOdd] = temp
                counterEven++
                counterOdd--
            }
        }
        return nums
    }

    /**
     *
     */
    fun sortArrayByParity1(nums: IntArray): IntArray {
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            val isLeftOdd = nums[left] % 2 == 1
            val isRightEvent = nums[right] % 2 == 0
            if (isLeftOdd && isRightEvent) {
                val tmp = nums[left]
                nums[left] = nums[right]
                nums[right] = tmp
                left++
                right--
            }

            if (isLeftOdd.not()) left++
            if (isRightEvent.not()) right--
        }

        return nums
    }

    /**
     * 一行解,但有點慢
     */
    fun sortArrayByParity2(nums: IntArray): IntArray {
        return nums.sortedByDescending { it % 2 == 0 }.toIntArray()
    }
}