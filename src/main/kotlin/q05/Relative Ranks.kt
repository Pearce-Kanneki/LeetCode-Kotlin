package q05

/**
 * No.506
 */
class `Relative Ranks` {

    fun findRelativeRanks(score: IntArray): Array<String> {

        val map = hashMapOf<Int, String>()
        val result = Array<String>(score.size){""}
        score.sortedDescending().forEachIndexed { index, item ->
            map[item] = when(index) {
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"
                else -> (index + 1).toString()
            }
        }

        for (i in score.indices) {
            result[i] = map[score[i]] ?: ""
        }

        return result
    }
}