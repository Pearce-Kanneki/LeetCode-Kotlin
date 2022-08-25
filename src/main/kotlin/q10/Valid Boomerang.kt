package q10

/**
 * No.1037
 */
class `Valid Boomerang` {

    /**
     *
     */
    fun isBoomerang(points: Array<IntArray>): Boolean {
        val (a1, a2) = points[0]
        val (b1, b2) = points[1]
        val (c1, c2) = points[2]

        return a1 * (b2 - c2) +
                b1 * (c2 - a2) +
                c1 * (a2 - b2) != 0
    }

    /**
     *
     */
    fun isBoomerang1(points: Array<IntArray>): Boolean {
        val v1 = Pair(points[1][0] - points[0][0], points[1][1] - points[0][1])
        val v2 = Pair(points[2][0] - points[0][0], points[2][1] - points[0][1])

        return v1.first * v2.second != v1.second * v2.first
    }
}