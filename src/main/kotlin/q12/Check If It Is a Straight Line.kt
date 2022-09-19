package q12

/**
 * No.1232
 */
class `Check If It Is a Straight Line` {

    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val deltaX = coordinates[0][0]
        val deltaY = coordinates[0][1]
        coordinates.forEach {
            it[0] -= deltaX
            it[1] -= deltaY
        }
        val a = coordinates[1][1]
        val b = -coordinates[1][0]
        for (i in 2 until coordinates.size) {
            val x = coordinates[i][0]
            val y = coordinates[i][1]

            if (a * x + b * y != 0) return false
        }

        return true
    }
}