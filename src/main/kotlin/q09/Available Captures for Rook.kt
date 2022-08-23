package q09

/**
 * No.999
 */
class `Available Captures for Rook` {

    /**
     * 較快的解
     */
    fun numRookCaptures(board: Array<CharArray>): Int {
        var output = 0
        var rookRowIndex = -1
        var rookColumnIndex = -1
        for (rowIndex in board.indices) {
            for (columnIndex in board[rowIndex].indices) {
                if (board[rowIndex][columnIndex] == 'R') {
                    rookRowIndex = rowIndex
                    rookColumnIndex = columnIndex
                    break
                }
            }
        }

        // 0 means left, 1 means top, 2 means right and 3 means bottom
        for ((direction, _) in (0 until 4).withIndex()) {
            var tempRookRowIndex = rookRowIndex
            var tempRookColumnIndex = rookColumnIndex
            when (direction) {
                0 -> tempRookColumnIndex--
                1 -> tempRookRowIndex--
                2 -> tempRookColumnIndex++
                3 -> tempRookRowIndex++
            }

            // Now we have the initial values
            while (tempRookRowIndex > -1 && tempRookRowIndex < 8 && tempRookColumnIndex > -1 && tempRookColumnIndex < 8) {
                if (board[tempRookRowIndex][tempRookColumnIndex] == 'B') {
                    break
                } else if (board[tempRookRowIndex][tempRookColumnIndex] == 'p') {
                    output++
                    break
                }
                when (direction) {
                    0 -> tempRookColumnIndex--
                    1 -> tempRookRowIndex--
                    2 -> tempRookColumnIndex++
                    3 -> tempRookRowIndex++
                }
            }

        }

        return output
    }

    /**
     *
     */
    fun numRookCaptures1(board: Array<CharArray>): Int {
        var rook = Pair(0,0)
        val checkList = listOf(Pair(-1, 0),Pair(1, 0),Pair(0, -1),Pair(0, 1))
        var count = 0

        for (i in board.indices) {
            for (j in board[i].indices) {
                if (board[i][j] == 'R') {
                    rook = Pair(i,j)
                    break
                }
            }
        }

        for (item in checkList) {
            if (checkBoard(board, rook, item)) count++
        }

        return count
    }

    private fun checkBoard(board: Array<CharArray>, rook: Pair<Int, Int>, point: Pair<Int, Int>): Boolean {

        var checkRook = Pair(rook.first + point.first, rook.second + point.second)
        while (inArea(checkRook)) {
            when(board[checkRook.first][checkRook.second]) {
                'B' -> return false
                'p' -> return true
                else -> {
                    checkRook = Pair(
                        checkRook.first + point.first,
                        checkRook.second + point.second
                    )
                }
            }
        }

        return false
    }

    private fun inArea(rook: Pair<Int, Int>): Boolean {
        return rook.first in 0..7 && rook.second in 0..7
    }
}