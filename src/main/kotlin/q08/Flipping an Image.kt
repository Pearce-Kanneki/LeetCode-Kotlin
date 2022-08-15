package q08

/**
 * No.832
 */
class `Flipping an Image` {

    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val result = Array(image.size){ IntArray(image[0].size){0} }
        for (i in image.indices) {
            for (j in image[i].indices) {
                result[i][j] = image[i][image[i].lastIndex - j] xor 1
            }
        }

        return result
    }
}