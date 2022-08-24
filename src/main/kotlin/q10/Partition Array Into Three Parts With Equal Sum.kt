package q10

/**
 * No.1013
 */
class `Partition Array Into Three Parts With Equal Sum` {

    fun canThreePartsEqualSum(arr: IntArray): Boolean {
        var totalSum = arr.sum()!!
        if (totalSum % 3 != 0) return false

        val average = totalSum / 3
        var count = 0
        var runningSum = 0
        for(num in arr) {
            runningSum += num
            if (runningSum == average) {
                count++
                runningSum = 0
            }
        }

        return count >= 3
    }

    fun canThreePartsEqualSum1(arr: IntArray): Boolean {
        var sum = arr.sum()

        if (sum % 3 != 0)
            return false

        val average = sum / 3
        var i = 0
        var j = arr.size-1

        // Check sum at the beginning
        var startSum = 0

        while (i < arr.size) {
            startSum += arr[i]
            i++

            if (startSum == average) break
        }

        if (i >= arr.size) return false

        // Check sum at the end
        var endSum = 0

        while (j >= 0) {
            endSum += arr[j]
            j--

            if (endSum == average) break
        }

        if (j <= 0 || i > j) return false

        // Check sum in the middle
        var middleSum = 0

        while (i <= j) {
            if (i < j) middleSum += arr[i] + arr[j]
            else middleSum += arr[i]

            i++
            j--
        }

        return startSum == endSum && endSum == middleSum
    }
}