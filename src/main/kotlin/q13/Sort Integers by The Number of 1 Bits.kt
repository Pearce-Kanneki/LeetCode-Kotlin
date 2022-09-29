package q13

/**
 * No.1356
 */
class `Sort Integers by The Number of 1 Bits` {

    fun sortByBits(arr: IntArray): IntArray {
        val data = sortedMapOf<Int, ArrayList<Int>>()
        val result = arrayListOf<Int>()
        for (ele in arr) {
            data.computeIfAbsent(countOf1sIn(ele)) { ArrayList() }.add(ele)
        }
        data.keys.forEach {
            val values = data[it]!!.sorted()
            for (ele in values) result.add(ele)
        }
        return result.toIntArray()
    }

    private fun countOf1sIn(number: Int): Int {
        var count = 0
        var num = number
        while (num > 0) {
            count++
            num = num and num - 1
        }
        return count
    }
}