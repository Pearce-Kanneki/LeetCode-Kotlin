package q10

import java.util.*
import kotlin.Comparator

/**
 * No.1122
 */
class `Relative Sort Array` {

    /**
     *
     */
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val map: TreeMap<Int, Int> = TreeMap()
        val result = IntArray(arr1.size)

        // put elemnts in arr1 in hashmap
        for ( i in arr1) {
            map.put(i, map.getOrPut(i){0} + 1)
        }

        // check arr2 and create the result
        var index = 0;
        for (i in arr2) {
            map.get(i)?.let {
                var n = it
                while(n > 0) {
                    result[index] = i
                    index++
                    n--
                }
            }
            map.remove(i)
        }

        map.forEach { (key, value) ->
            for (i in 1..value) {
                result[index] = key
                index++;
            }
        }

        return result;
    }

    /**
     *
     */
    fun relativeSortArray1(arr1: IntArray, arr2: IntArray): IntArray {
        val set = arr2.toSet()
        val comparator = Comparator { o1: Int, o2: Int ->
            return@Comparator when {
                o1 == o2 -> 0
                set.contains(o1) && set.contains(o2) -> {
                    if (set.indexOf(o1) > set.indexOf(o2)) 1 else -1 // a > b
                }
                set.contains(o1) && !set.contains(o2) -> -1 // a < b
                !set.contains(o1) && set.contains(o2) -> 1 // a > b
                else -> if(o1 > o2) 1 else -1
            }
        }

        return arr1.sortedWith(comparator).toIntArray()
    }
}