package q12

/**
 * No.1200
 */
class `Minimum Absolute Difference` {

    /**
     *
     */
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        if (arr.size == 2) return listOf(arr.sorted().toList())
        arr.sort()
        val list = mutableListOf<List<Int>>()
        var absMin = Int.MAX_VALUE
        for (i in 0..arr.size - 2) {
            val dif = arr[i + 1] - arr[i]
            if (dif < absMin) {
                list.clear()
                absMin = dif
            }
            if (dif == absMin) {
                list.add(listOf(arr[i], arr[i + 1]))
            }
        }
        return list
    }

    /**
     *
     */
    fun minimumAbsDifference1(arr: IntArray): List<List<Int>> {
        arr.sort()
        var d = arr[1] - arr[0]
        val ans = mutableListOf<List<Int>>()
        for (i in 1 until arr.size) {
            (arr[i] - arr[i - 1]).also {
                if (it == d) {
                    ans.add(listOf(arr[i - 1], arr[i]))
                } else if (it < d) {
                    ans.clear()
                    ans.add(listOf(arr[i - 1], arr[i]))
                    d = it
                }
            }
        }

        return ans
    }
}