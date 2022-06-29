package q00

/**
 * No.58
 */
class `Length of Last Word` {

    /**
     * 參考別人較好的解
     */
    fun lengthOfLastWord(s: String): Int = s.trim()?.let {
        it.lastIndex - it.lastIndexOf(' ')
    }

    fun lengthOfLastWord1(s: String): Int {
        return  s.trim().split(' ').lastOrNull()?.length ?: 0
    }

    /**
     * 較省資源
     */
    fun lengthOfLastWord2(s: String): Int {

        var count = 0

        for(i in s.length - 1 downTo 0) {

            if(s[i] != ' ') {
                count++
            } else if(count > 0) {
                break
            }
        }

        return count
    }
}