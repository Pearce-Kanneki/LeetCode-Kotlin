package q10

/**
 * No.1021
 */
class `Remove Outermost Parentheses` {

    /**
     *
     */
    fun removeOuterParentheses(s: String): String {
        val sb = StringBuffer()
        var depth = 0
        for(i in s.indices) {
            val ch = s[i]
            if(ch == '(') depth ++
            if(ch == ')') depth --
            if((ch == '(' && depth == 1) || (ch == ')' && depth == 0)) continue
            sb.append(ch)
        }
        return sb.toString()
    }

    /**
     *
     */
    fun removeOuterParentheses1(s: String): String {
        var level = 0
        val ans = StringBuffer()
        for (item in s) {
            if (item == ')') level--
            if (level > 0) ans.append(item)
            if (item == '(') level++
        }

        return ans.toString()
    }
}