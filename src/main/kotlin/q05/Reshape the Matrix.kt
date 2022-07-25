package q05

/**
 * No.566
 */
class `Reshape the Matrix` {

    /**
     * 較快的方法
     */
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if(mat.size * mat[0].size != r * c) {
            return mat
        }

        var m =0
        var n = 0
        val newMat = mutableListOf<IntArray>()
        for(i in 0 until r) {
            val arr = mutableListOf<Int>()
            for(j in 0 until c) {
                arr.add(mat[m][n])
                n++
                if(n >= mat[0].size) {
                    n = 0
                    m++
                }
            }
            newMat.add(arr.toIntArray())
        }

        return newMat.toTypedArray()
    }

    /**
     *
     */
    fun matrixReshape1(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {

        if (mat.size * mat[0].size != r * c) return mat
        val result = Array(r){ IntArray(c)}
        for (i in mat.indices) {
            for (j in mat[i].indices) {
                val listIndex = i * mat[i].size + j
                result[listIndex / c][listIndex % c] = mat[i][j]
            }
        }

        return result
    }
}