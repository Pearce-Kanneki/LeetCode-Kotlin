package q09

/**
 * NO.941
 */
class `Valid Mountain Array` {

    fun validMountainArray(arr: IntArray): Boolean {

        if (arr.size < 3) return false
        var m = Pair<Boolean, Boolean>(false, false)

        for (i in 1 until arr.size) {

            if (arr[i] > arr[i - 1]) {
                if (m.second) return false
                if (!m.first) m = m.copy(first = true)
            } else if (arr[i] < arr[i - 1]) {
                if (!m.first) return false
                if (!m.second) m = m.copy(second = true)
            } else return false
        }

        return m.first && m.second
    }
}