package q07

/**
 * No.771
 */
class `Jewels and Stones` {

    fun numJewelsInStones(jewels: String, stones: String): Int {

        val set = HashSet<Char>()
        var count = 0
        for (i in jewels.indices) {
            set.add(jewels[i])
        }

        for (i in stones.indices) {
            if (set.contains(stones[i])) {
                count++
            }
        }

        return count
    }
}