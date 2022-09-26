package q15

/**
 * No.1588
 */
class `Sum of All Odd Length Subarrays` {

    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var sum = 0
        for (i in arr.indices) {
            val leftCount = i
            val rightCount = arr.size - i - 1
            val leftOdd = (leftCount + 1) / 2
            val rightOdd = (rightCount + 1) / 2
            val leftEven = leftCount / 2 + 1
            val rightEven = rightCount / 2 + 1
            sum += arr[i] * (leftOdd * rightOdd + leftEven * rightEven)
        }

        return sum
    }
}