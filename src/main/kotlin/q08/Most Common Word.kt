package q08

/**
 * No.819
 */
class `Most Common Word` {

    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val bannedSet = banned.toSet()
        val wordCount = HashMap<String, Int>()
        var mostCommonWord = ""
        var mostCommonCount = 0
        var p = 0
        while (p < paragraph.length) {
            val wordBuilder = StringBuffer()
            var q = p
            while (q < paragraph.length && ((paragraph[q] in 'a'..'z') || (paragraph[q] in 'A'..'Z'))){
                wordBuilder.append(paragraph[q].toLowerCase())
                q++
            }
            if (wordBuilder.isNotEmpty()) {
                val world = wordBuilder.toString()
                if (!bannedSet.contains(world)) {
                    wordCount[world] = wordCount.getOrDefault(world, 0) + 1
                    if ((wordCount[world] ?: 0) > mostCommonCount) {
                        mostCommonCount = wordCount[world] ?: 0
                        mostCommonWord = world
                    }
                }
            }

            p = q + 1
        }

        return mostCommonWord
    }
}