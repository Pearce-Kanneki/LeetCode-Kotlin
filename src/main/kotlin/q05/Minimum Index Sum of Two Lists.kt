package q05

/**
 * No.599
 */
class `Minimum Index Sum of Two Lists` {

    /**
     * 較快的解
     */
    fun findRestaurant(A: Array<String>, B: Array<String>): Array<String> {
        val first = mutableMapOf<String, Int>()
        for (i in 0 .. A.size-1) {
            first[A[i]] = i
        }
        val ret = mutableListOf<String>()
        var least = 1e5.toInt()
        for (i in 0 .. B.size-1) {
            if (B[i] in first) {
                val comb = i + first[B[i]]!!;
                if (comb < least) {
                    least = comb
                    ret.clear()
                    ret.add(B[i])
                } else if (comb == least) {
                    ret.add(B[i])
                }
            }
        }
        val arr = Array<String>(ret.size){""}
        for (i in 0..ret.size-1) {
            arr[i] = ret[i]
        }
        return arr
    }

    /**
     *
     */
    fun findRestaurant1(list1: Array<String>, list2: Array<String>): Array<String> {
        val map = HashMap<String, Int>()
        list1.forEachIndexed { index, s -> map[s] = index }

        val ret = mutableListOf<String>()
        var indexSum = Int.MAX_VALUE
        for (i in list2.indices) {
            if (map.containsKey(list2[i])) {
                val j = map[list2[i]] ?: Int.MAX_VALUE
                if (i + j < indexSum) {
                    ret.clear()
                    ret.add(list2[i])
                    indexSum = i + j
                } else if(i + j == indexSum) {
                    ret.add(list2[i])
                }
            }
        }

        return ret.toTypedArray()
    }
}