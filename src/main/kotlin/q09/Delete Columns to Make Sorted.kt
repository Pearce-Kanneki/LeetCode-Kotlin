package q09

/**
 * No.944
 */
class `Delete Columns to Make Sorted` {

    /**
     * 較快的解
     */
    fun minDeletionSize(strs: Array<String>): Int {
        var result = 0
        val length = strs[0].length

        for (i in 0 until length) {
            var char = strs[0][i]
            for (str in strs) {
                if (str[i] < char) {
                    result += 1
                    break
                } else {
                    char = str[i]
                }
            }
        }
        return result
    }

    /**
     *
     */
    fun minDeletionSize1(strs: Array<String>): Int {

        val check = BooleanArray(strs.first().length){ false }
        for (i in 1 until strs.size) {
            for (j in strs[i].indices) {
                if (check[j]) continue
                if (strs[i][j] - 'a' < strs[i - 1][j] - 'a') {
                    check[j] = true
                }
            }
        }

        return check.filter { it }.size
    }
}