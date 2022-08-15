package q08

/**
 * No.844
 */
class `Backspace String Compare` {

    /**
     *
     */
    fun backspaceCompare(s: String, t: String): Boolean =
        createString(s) == createString(t)

    private fun createString(input: String): String {
        val sb = StringBuilder()
        for (c in input) {
            if (c == '#')
                if (sb.isNotEmpty())
                    sb.deleteCharAt(sb.length - 1)
                else
                    continue
            else
                sb.append(c)
        }

        return sb.toString()
    }

    /**
     *
     */
    fun backspaceCompare1(s:String, t:String): Boolean {
        var sPtr = ffToNextC(s, s.length)
        var tPtr = ffToNextC(t, t.length)
        while (sPtr >= 0 && tPtr >= 0) {
            if (s[sPtr] != t[tPtr]) {
                return false
            }
            sPtr = ffToNextC(s, sPtr)
            tPtr = ffToNextC(t, tPtr)
        }
        return sPtr < 0 && tPtr < 0
    }

    fun ffToNextC(s: String, i: Int): Int {
        var charsToSkip = 1
        var newIdx = i
        while (charsToSkip > 0) {
            newIdx--
            if (newIdx < 0) { return -1 }
            if (s[newIdx] == '#') {
                charsToSkip++
            } else {
                charsToSkip--
            }
        }
        return newIdx
    }

    /**
     *
     */
    fun backspaceCompare2(s: String, t: String): Boolean {
        return build(s) == build(t)
    }

    private fun build(s: String): String {
        val sb = StringBuffer()
        s.forEach {
            if (it != '#') {
                sb.append(it)
            } else if(sb.isNotEmpty()){
                sb.deleteCharAt(sb.lastIndex)
            }
        }

        return sb.toString()
    }
}