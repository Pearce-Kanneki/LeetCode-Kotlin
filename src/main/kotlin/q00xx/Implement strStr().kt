package q00xx

/**
 * No.28
 */
class `Implement strStr()` {

    fun strStr(haystack: String, needle: String): Int {
        // return haystack.indexOf(needle)
        if (haystack.isBlank() || needle.isBlank()) return -1
        haystack.forEachIndexed { index, c ->
            if (c == needle[0] ) {
                if (index + needle.length <= haystack.length) {
                    for (i in needle.indices) {
                        if (haystack[index + i] != needle[i]) {
                            break
                        }
                        if (i == needle.length - 1){
                            return index
                        }
                    }
                }
            }
        }
        return -1
    }
}