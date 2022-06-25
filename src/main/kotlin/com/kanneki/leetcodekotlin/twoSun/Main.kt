package com.kanneki.leetcodekotlin.twoSun

class Main {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val map = HashMap<Int, Int>()

        nums.forEachIndexed { index, i ->

            map[target - i]?.let {
                return intArrayOf(i, it)
            }

            map[i] = index
        }

        return IntArray(0)
    }

    fun twoSum1(nums: IntArray, target: Int): IntArray {

        for( i in nums.indices) {
            val find = nums.indexOfLast {it == target - nums[i] }
            if (find > 0) {
                return intArrayOf(i, find)
            }
        }

        return IntArray(0)
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {

        for (i in nums.indices) {
            if (i + 1 > nums.size) return IntArray(0)
            val findIndexNumber = target - nums[i]
            for (j in i + 1 until nums.size) {
                if (findIndexNumber == nums[j]) {
                    return intArrayOf(i, j)
                }
            }
        }

        return IntArray(0)
    }
}