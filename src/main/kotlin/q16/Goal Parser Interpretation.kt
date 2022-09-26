package q16

/**
 * No.1678
 */
class `Goal Parser Interpretation` {

    /**
     * 一行解
     */
    fun interpret(command: String): String {
        return command.replace("(al)", "al").replace("()","o")
    }

    /**
     *
     */
    fun interpret1(command: String): String {
        val ans = StringBuffer()
        var isO = false
        command.forEach {
            if (it != '(' && it != ')'){
                isO = false
                ans.append(it)
            } else if (it == '(') {
                isO = true
            } else if (isO) {
                ans.append('o')
                isO = false
            }
        }

        return ans.toString()
    }
}
