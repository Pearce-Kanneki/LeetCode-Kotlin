package q08

/**
 * No.867
 */
class `Transpose Matrix` {

    /**
     *
     */
    fun transpose1(matrix: Array<IntArray>): Array<IntArray> {
        val result = Array(matrix[0].size){ IntArray(matrix.size) {0} }
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                result[j][i] = matrix[i][j]
            }
        }

        return result
    }
}