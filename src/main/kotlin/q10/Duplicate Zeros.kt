package q10

import java.util.*

/**
 * No.1089
 */
class `Duplicate Zeros` {

    fun duplicateZeros(arr: IntArray): Unit {
        val tmp = LinkedList<Int>()
        for (i in arr.indices) {
            tmp.add(arr[i])
            if (arr[i] == 0) tmp.add(arr[i])

            arr[i] = tmp.pop()
        }
    }
}