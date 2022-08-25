package q10

import java.util.*

/**
 * No.1030
 */
class `Matrix Cells in Distance Order` {

    /**
     *
     */
    fun allCellsDistOrder(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray> {
        var ans = Array(rows * cols){ IntArray(2) }
        var index = 0

        var q: Queue<IntArray> = LinkedList()
        var visited = Array(rows){ BooleanArray(cols) }
        q.offer(intArrayOf(rCenter, cCenter))
        visited[rCenter][cCenter] = true

        val dirs = arrayOf(intArrayOf(0, -1), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(1, 0))
        while (q.isNotEmpty()){
            val crr = q.poll() ?: continue
            ans[index][0] = crr[0]
            ans[index++][1] = crr[1]
            for (dir in dirs) {
                var nextX = crr[0] + dir[0]
                var nextY = crr[1] + dir[1]
                if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || visited[nextX][nextY]){
                    continue
                }
                q.offer(intArrayOf(nextX, nextY))
                visited[nextX][nextY] = true
            }
        }
        return ans
    }

    /**
     *
     */
    fun allCellsDistOrder1(rows: Int, cols: Int, rCenter: Int, cCenter: Int): Array<IntArray> {

        val ans = Array(rows * cols){ intArrayOf() }
        for (i in 0 until rows) {
            for (j in 0 until  cols) {
                ans[i*cols + j] = intArrayOf(i,j)
            }
        }
        ans.sortBy {
            Math.abs(rCenter - it[0]) + Math.abs(cCenter - it[1])
        }

        return ans
    }
}