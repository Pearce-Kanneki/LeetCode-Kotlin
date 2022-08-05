package q07

/**
 * No.766
 */
class `Toeplitz Matrix` {

    /**
     * 
     */
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        for (i in 0 until matrix.size - 1) {
            for (j in 0 until matrix[i].size - 1) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false
                }
            }
        }

        return true
    }
}