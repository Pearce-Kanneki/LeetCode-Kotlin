package q04

/**
 * No.463
 */
class `Island Perimeter` {

    fun islandPerimeter(grid: Array<IntArray>): Int {

        var count = 0
        grid.forEachIndexed { index, ints ->
            for (i in ints.indices) {
                if (ints[i] == 0) continue

                var itemCount = 4
                if (i > 0 && ints[i - 1] == 1) --itemCount
                if (i < ints.size - 1 && ints[i + 1] == 1) --itemCount
                if (index > 0 && grid[index - 1][i] == 1) --itemCount
                if (index < grid.size - 1 && grid[index + 1][i] == 1) --itemCount
                count += itemCount
            }
        }

        return count
    }
}