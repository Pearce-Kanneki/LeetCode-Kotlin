package q08

/**
 * No.830
 */
class `Positions of Large Groups` {

    fun largeGroupPositions(s: String): List<List<Int>> {
        var sIndex = 0
        val result = mutableListOf<List<Int>>()

        while (sIndex < s.length) {
            var eIndex = sIndex
            while (eIndex < s.length && s[eIndex] == s[sIndex]) {
                eIndex++
            }
            if (eIndex - sIndex >= 3) {
                result.add(listOf(sIndex, eIndex - 1))
            }
            sIndex = eIndex
        }

        return result
    }
}