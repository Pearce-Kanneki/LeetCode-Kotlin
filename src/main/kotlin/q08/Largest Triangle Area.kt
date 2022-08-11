package q08

/**
 * No.812
 */
class `Largest Triangle Area` {

    fun largestTriangleArea(points: Array<IntArray>): Double {

        var ret = 0.0
        for (i in points.indices) {
            for (j in (i + 1) until points.size) {
                for (k in (j + 1) until points.size) {
                    ret = Math.max(
                        ret,
                        triangleArea(
                            points[i][0],
                            points[i][1],
                            points[j][0],
                            points[j][1],
                            points[k][0],
                            points[k][1]
                        )
                    )
                }
            }
        }

        return ret
    }

    private fun triangleArea(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int): Double {
        return .5 * Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - x1 * y3 - x2 * y1 - x3 * y2)
    }
}