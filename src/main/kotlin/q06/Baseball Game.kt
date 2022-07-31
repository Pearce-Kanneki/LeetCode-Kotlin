package q06

/**
 * No.682
 */
class `Baseball Game` {

    /**
     * 可以使用 ArrayDeque<Int>()
     */


    /**
     *
     */
    fun calPoints1(ops: Array<String>): Int {

        val count = mutableListOf<Int>()
        for (i in ops.indices) {
            when(ops[i]) {
                "C" -> count.removeAt(count.lastIndex)
                "D" -> count.add(count.last() * 2)
                "+" -> count.add(count.last() + count[count.lastIndex - 1])
                else -> {
                    ops[i].toIntOrNull()?.let {
                        count.add(it)
                    }
                }
            }
        }

        return count.sum()
    }
}