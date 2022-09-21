package q17

/**
 * No.1779
 */
class `Find Nearest Point That Has the Same X or Y Coordinate` {

    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var ans = -1
        var min = Int.MAX_VALUE

        for (i in points.indices) {
            val newX = points[i][0]
            val newY = points[i][1]

            if (x == newX || y == newY) {
                val manhattan = Math.abs(x - newX) + Math.abs(y - newY)

                if (manhattan < min) {
                    min = manhattan
                    ans = i
                }
            }
        }

        return ans
    }

    /**
     *
     */
    fun nearestValidPoint1(x: Int, y: Int, points: Array<IntArray>): Int {
        var ans = -1
        var min = Int.MAX_VALUE

        for (i in points.indices) {
            val item = points[i]
            if (item[0] != x && item[1] != y) continue

            val dx = d(x, y, item[0], item[1])
            if (dx < min) {
                ans = i
                min = dx
            }
        }

        return ans
    }

    private fun d(x1: Int, y1: Int, x2: Int, y2: Int): Int {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2)
    }
}