package q04

/**
 * No.495
 */
class `Teemo Attacking` {

    /**
     * 較快的解
     */
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var count = 0 - duration
        var totalTime = 0

        for (i in timeSeries) {
            if (i - count < duration)
                totalTime += i - count
            else
                totalTime += duration

            count = i
        }

        return totalTime
    }

    /**
     *
     */
    fun findPoisonedDuration1(timeSeries: IntArray, duration: Int): Int {

        var count = 0
        timeSeries.forEachIndexed { index, item ->
            count += if (index == timeSeries.lastIndex || item + duration <= timeSeries[index + 1]) duration
            else timeSeries[index + 1] - item
        }

        return count
    }
}