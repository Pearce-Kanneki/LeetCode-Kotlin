package q12

/**
 * No.1207
 */
class `Unique Number of Occurrences` {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        arr.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }

        val check = HashSet<Int>()
        for (it in map) {
            if (!check.add(it.value))
                return false
        }

        return true
    }
}