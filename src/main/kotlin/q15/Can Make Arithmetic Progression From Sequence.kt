package q15

/**
 * No.1502
 */
class `Can Make Arithmetic Progression From Sequence` {

    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        if (arr.size == 2) return true
        arr.sort()
        val d = arr[1] - arr[0]
        for (i in 1 until arr.lastIndex) {
            if (arr[i + 1] - arr[i] != d)
                return false
        }

        return true
    }
}