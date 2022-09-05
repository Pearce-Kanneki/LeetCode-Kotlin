package q11

/**
 * No.1448
 */
class `Distance Between Bus Stops` {

    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        val low = minOf(start, destination)
        val height = maxOf(start, destination)

        var len1 = 0
        var len2 = 0
        for (i in distance.indices) {
            if(i in low until height) {
                len1 += distance[i]
            } else {
                len2 += distance[i]
            }
        }

        return minOf(len1, len2)
    }
}
