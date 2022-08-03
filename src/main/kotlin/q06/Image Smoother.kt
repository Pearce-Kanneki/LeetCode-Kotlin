package q06

/**
 * No.661
 */
class `Image Smoother` {

    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {

        val ans = Array<IntArray>(img.size){ IntArray(img[0].size){0} }
        val dirs = arrayOf(intArrayOf(0,0), intArrayOf(1,0), intArrayOf(-1,0),
            intArrayOf(0,1), intArrayOf(0,-1), intArrayOf(-1,-1), intArrayOf(-1,1),
            intArrayOf(1,-1), intArrayOf(1,1))

        for (i in 0 until img.size) {
            for (j in 0 until img[i].size) {
                var tot = 0
                var cnt = 0
                for (di in dirs) {
                    val nx = i + di[0]
                    val ny = j + di[1]

                    if (nx < 0 || nx >= img.size || ny < 0 || ny >= img[i].size)
                        continue

                    tot += img[nx][ny]
                    cnt++
                }
                ans[i][j] = tot/cnt
            }
        }

        return ans
    }
}