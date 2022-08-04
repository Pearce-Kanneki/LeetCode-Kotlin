package q07

/**
 * No.744
 */
class `Find Smallest Letter Greater Than Target` {

    /**
     * 較快的解
     */
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var left = 0
        var right = letters.size

        while (left < right) {
            val mid = left + (right - left) / 2
            val curr = letters[mid]

            if (curr <= target) {
                // current is < target and one to right is also less than target. Must be to right
                left = mid + 1
            } else {
                right = mid
            }
        }

        return letters[left % letters.size]
    }

    /**
     *
     */
    fun nextGreatestLetter1(letters: CharArray, target: Char): Char {
        if (target >= letters[letters.lastIndex]) return letters[0]
        var left = 0
        var right = letters.lastIndex
        while (left < right) {
            val mid = (right - left) / 2 + left
            if (letters[mid] > target) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return letters[left]
    }
}