package q02

/**
 * No.228
 */
class `Summary Ranges` {

    fun summaryRanges(nums: IntArray): List<String>? {
        val list = ArrayList<String>()
        var i = 0
        while (i < nums.size) {
            val start = nums[i]
            while (i + 1 < nums.size && nums[i] + 1 == nums[i + 1]) i++
            if (start != nums[i]) {
                list.add("" + start + "->" + nums[i])
            } else {
                list.add("" + start)
            }
            i++
        }
        return list
    }

    fun summaryRanges1(nums: IntArray): List<String> {

        if (nums.size == 1) return listOf(nums[0].toString())
        var firstIndex = 0
        val result = mutableListOf<String>()

        for (nowIndex in 1..nums.size) {
            if (nowIndex == nums.size || nums[nowIndex - 1] + 1 != nums[nowIndex]) {
                if (nowIndex == firstIndex + 1) {
                    result.add(nums[firstIndex].toString())
                } else {
                    result.add("${nums[firstIndex]}->${nums[nowIndex - 1]}")
                }
                firstIndex = nowIndex
            }
        }

        return result
    }
}