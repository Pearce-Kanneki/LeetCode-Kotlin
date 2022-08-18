package q08

/**
 * No.888
 */
class `Fair Candy Swap` {

    /**
     *
     */
    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        var a = 0
        var b = 0
        val hash = HashSet<Int>()

        for (i in aliceSizes) a += i
        for (i in bobSizes) b += i.also { hash.add(i) }
        for (i in aliceSizes) if (hash.contains(i + ((b - a) / 2))) return intArrayOf(i, i + ((b - a) / 2))

        return intArrayOf()
    }

    /**
     *
     */
    fun fairCandySwap1(aliceSizes: IntArray, bobSizes: IntArray): IntArray {

        val d = (aliceSizes.sum() - bobSizes.sum()) / 2
        for (i in bobSizes.indices) {
            aliceSizes.find { it == bobSizes[i] + d }?.let {
                return intArrayOf(it, bobSizes[i])
            }
        }

        return intArrayOf(-1, -1)
    }
}