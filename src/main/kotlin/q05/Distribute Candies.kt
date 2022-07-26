package q05

/**
 * No.575
 */
class `Distribute Candies` {

    /**
     * 較快的解
     */
    fun distributeCandies(candyType: IntArray): Int {
        val set = candyType.toSet().size
        val totalCandy = candyType.size / 2
        //return set.takeIf { it <= totalCandy } ?: totalCandy
        return if (set <= totalCandy) set else totalCandy
    }

    /**
     *  較省的解
     */
    fun distributeCandies1(candyType: IntArray): Int {
        var candyTypeSet = mutableSetOf<Int>()
        for (i in candyType) {
            candyTypeSet.add(i)
        }

        var n = candyType.size / 2

        return if (candyTypeSet.size <= n) candyTypeSet.size else n
    }

    /**
     *
     */
    fun distributeCandies2(candyType: IntArray): Int {
        val set = HashSet<Int>()
        for (item in candyType) {
            if (!set.contains(item)){
                set.add(item)
            }
        }
        return Math.min(set.size, candyType.size / 2)
    }
}