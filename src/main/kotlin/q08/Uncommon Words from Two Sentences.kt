package q08

/**
 * No.884
 */
class `Uncommon Words from Two Sentences` {

    /**
     *
     */
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        return "$s1 $s2".split(" ")
            .groupBy { stringValue -> stringValue }
            .filter { it.value.size == 1 }
            .map { it.key }
            .toTypedArray()
    }

    /**
     *
     */
    fun uncommonFromSentences1(s1: String, s2: String): Array<String> {

        val map = HashMap<String, Int>()
        s1.split(" ").forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        s2.split(" ").forEach {
            if (map[it] == null) map[it] = -1
            else if (map[it] == 1 || map[it] == -1) map[it] = 0
        }

        return map.filter { it.value == 1 || it.value == -1}.map { it.key }.toTypedArray()
    }
}