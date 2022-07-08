package q02

/**
 * No.290
 */
class `Word Pattern` {

    fun wordPattern(pattern: String, s: String): Boolean {
        val wordsInS = s.split(' ')

        if(pattern.length != wordsInS.size)
            return false

        val distinctCharacters = pattern.toSet().size
        val distinctWords = wordsInS.distinct().size

        val finalSet = pattern.mapIndexed() { index, char ->
            char + wordsInS[index]
        }.toSet()

        return distinctCharacters == distinctWords && distinctCharacters == finalSet.size
    }

    fun wordPattern1(pattern: String, s: String): Boolean {

        val sList = s.split(" ")
        if (pattern.length != sList.size) return false
        val map = mutableMapOf<Char, String>()
        val set = mutableSetOf<String>()

        for (i in pattern.indices) {

            if (map[pattern[i]] != sList[i]) {
                if (map[pattern[i]] != null || set.contains(sList[i])) return false
                map[pattern[i]] = sList[i]
                set.add(sList[i])
            }
        }

        return true
    }
}