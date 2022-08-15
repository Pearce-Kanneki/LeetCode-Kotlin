package q08

/**
 * No.868
 */
class `Binary Gap` {

    /**
     *
     */
    fun binaryGap(n: Int): Int {
        var temp = n
        var maxDistance = 0
        var currDistance = 0
        while (temp != 0) {
            if (temp % 2 == 1) {
                maxDistance = maxOf(currDistance, maxDistance)
                currDistance = 1
            } else if (currDistance > 0) {
                currDistance++
            }
            temp /= 2
        }

        return maxDistance
    }

    /**
     *
     */
    fun binaryGap1(n: Int): Int {
        var leftIndex = -1
        var maxCount = 0
        val check = n.toString(2)

        for (i in check.indices) {
            if (check[i] != '1') continue
            if (leftIndex < 0) leftIndex = i
            else {
                maxCount = maxOf(maxCount, i - leftIndex)
                leftIndex = i
            }
        }

        return maxCount
    }
}