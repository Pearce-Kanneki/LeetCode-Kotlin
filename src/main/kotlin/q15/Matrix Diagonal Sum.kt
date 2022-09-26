package q15

/**
 * No.1572
 */
class `Matrix Diagonal Sum` {

    fun diagonalSum(mat: Array<IntArray>): Int {

        val mid = mat.size / 2
        var sum = 0
        for (i in 0 until mid) {
            val right = mat.size - 1 - i

            sum += mat[i][i] + mat[i][right]
            sum += mat[right][i] + mat[right][right]
        }

        if (mat.size % 2 > 0) {
            sum += mat[mid][mid]
        }

        return sum
    }
}