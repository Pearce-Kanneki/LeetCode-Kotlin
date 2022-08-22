package q09

/**
 * No.989
 */
class `Add to Array-Form of Integer` {
    /**
     *
     */
    fun addToArrayForm(num: IntArray, k: Int): List<Long> {
        var curr = k
        val list = ArrayList<Long>()

        var index = num.size
        while (--index >= 0 || curr > 0) {
            if (index >= 0) curr += num[index]
            list.add((curr % 10).toLong())
            curr /= 10
        }
        list.reverse()
        return list
    }

    /**
     *
     */
    fun addToArrayForm1(num: IntArray, k: Int): List<Int> {
        var count = k
        val result = mutableListOf<Int>()
        var index = num.lastIndex
        while (count > 0 || index >= 0) {
            if (index >= 0) count += num[index--]

            result.add(count % 10)
            count /= 10
        }

        return result.reversed()
    }
}