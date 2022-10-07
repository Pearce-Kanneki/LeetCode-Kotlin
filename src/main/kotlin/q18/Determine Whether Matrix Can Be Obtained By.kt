package q18

/**
 * No.1886
 */
class `Determine Whether Matrix Can Be Obtained By` {

    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        val n = mat.size - 1

        check@ for (it in 0 until 4) {
            for (i in mat.indices) {
                for (j in mat[i].indices) {
                    when(it) {
                        0 -> {
                            if (mat[i][j] != target[i][j])
                                continue@check
                        }
                        1 -> {
                            if (mat[i][j] != target[j][n - i])
                                continue@check
                        }
                        2 -> {
                            if (mat[i][j] != target[n - i][n - j])
                                continue@check
                        }
                        else -> {
                            if (mat[i][j] != target[n - j][i])
                                return false
                        }
                    }
                }
            }

            return true
        }

        return false
    }
}