package q08

/**
 * No.892
 */
class `Surface Area of 3D Shapes` {

    /**
     *
     */
    fun surfaceArea(grid: Array<IntArray>): Int {
        var total = 0

        for (i in grid.indices) {
            for (j in grid.indices) {
                if (grid[i][j] > 0) total += 6 * grid[i][j] - 2 * (grid[i][j] - 1) //Surface Area of 1 cube: 6*grid[i][j]; Common Surface Area of vertically placed cubes:2*(grid[i][j]-1)
                if (i > 0) total -= 2 * Math.min(grid[i - 1][j], grid[i][j]) //Hidden common vertical surface area
                if (j > 0) total -= 2 * Math.min(grid[i][j - 1], grid[i][j]) //Hidden common horizontal surface area
            }
        }

        return total
    }

    /**
     *
     */
    fun surfaceArea1(grid: Array<IntArray>): Int {

        var area = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                val level = grid[i][j]

                if (level > 0) {
                    area += (level shl 2) + 2
                    area -= if (i > 0) Math.min(level, grid[i - 1][j]) shl 1 else 0
                    area -= if (j > 0) Math.min(level, grid[i][j - 1]) shl 1 else 0
                }
            }
        }

        return area
    }
}