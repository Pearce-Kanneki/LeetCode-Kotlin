package q07

/**
 * No.733
 */
class `Flood Fill` {

    /**
     * 較快的解
     */
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val currentColor = image[sr][sc]
        if(currentColor != newColor){
            dfs(image, sr, sc, currentColor, newColor)
        }
        return image
    }

    fun dfs(image: Array<IntArray>, r: Int, c: Int, color: Int, newColor: Int){
        if(image[r][c] == color){
            image[r][c] = newColor
            if(r >= 1) dfs(image, r - 1, c, color, newColor)
            if(c >= 1) dfs(image, r, c - 1, color, newColor)
            if(r + 1 < image.size) dfs(image, r + 1, c, color, newColor)
            if(c + 1 < image[0].size) dfs(image, r, c + 1, color, newColor)
        }
    }

    /**
     *
     */
    fun floodFill1(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) return image
        return setNewColor(image, sr, sc, color, image[sr][sc])
    }

    private fun setNewColor(image: Array<IntArray>, sr: Int, sc: Int, newcolor: Int, oldColor: Int): Array<IntArray> {
        if (check(image.size, image[0].size, sr, sc) || image[sr][sc] != oldColor) return image

        image[sr][sc] = newcolor
        setNewColor(image, sr - 1, sc, newcolor, oldColor)
        setNewColor(image, sr, sc - 1, newcolor, oldColor)
        setNewColor(image, sr + 1, sc, newcolor, oldColor)
        setNewColor(image, sr, sc + 1, newcolor, oldColor)

        return image
    }

    private fun check(imageSize: Int, detailSize: Int, sr: Int, sc: Int) =
        sr < 0 || sc < 0 || sr >= imageSize || sc >= detailSize
}