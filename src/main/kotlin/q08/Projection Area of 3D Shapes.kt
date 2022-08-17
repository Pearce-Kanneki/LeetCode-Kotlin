package q08

/**
 * No.883
 */
class `Projection Area of 3D Shapes` {

    fun projectionArea(grid: Array<IntArray>): Int {

        val one = grid.flatMap { it.map { Math.min(it, 1) } }.sum()
        val two = grid.map { it.max() ?: 0 }.sum()
        val three = (0 until grid[0].size).map { c -> (0 until grid.size).map { grid[it][c] }.max() ?: 0 }.sum()

        return one + two + three
    }
}