package q09

/**
 * No.914
 */
class `X of a Kind in a Deck of Cards` {

    fun hasGroupsSizeX(deck: IntArray): Boolean {

        val count = HashMap<Int, Int>()
        for (item in deck)
            count[item] = count.getOrDefault(item, 0) + 1

        var g = -1
        for (item in count.values) {
            g = if (g == -1) item else gcd(g, item)
        }

        return g >= 2
    }

    private fun gcd(x: Int, y: Int): Int {
        return if (x == 0) y else gcd(y % x, x)
    }
}