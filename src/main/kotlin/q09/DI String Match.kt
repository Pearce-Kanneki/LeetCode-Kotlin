package q09

/**
 * No.942
 */
class `DI String Match` {

    fun diStringMatch(s: String): IntArray {

        var minNum = 0
        var maxNum = s.length
        val ans = IntArray(s.length + 1)
        s.forEachIndexed { index, it ->
            ans[index] = if (it == 'I') minNum++ else maxNum--
        }

        ans[ans.lastIndex] = minNum

        return ans
    }
}