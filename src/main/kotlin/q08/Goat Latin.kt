package q08

/**
 * No.824
 */
class `Goat Latin` {

    /**
     * 較快的解
     */
    fun toGoatLatin(S: String): String {
        val a = StringBuilder("a")
        return S.split(" ").joinToString(" ") {
            if ("aeiou".contains(it[0].toLowerCase())) (it + "ma" + a).also { a.append("a") }
            else (it.substring(1) + it[0] + "ma" + a).also { a.append("a") }
        }
    }

    /**
     *
     */
    fun toGoatLatin1(sentence: String): String {
        return sentence.split(" ").asSequence()
            .map { if (beginsWithVowel(it)) "${it}ma" else "${it.substring(1)}${it[0]}ma" }
            .mapIndexed { index, word -> word + "a".repeat(index + 1) }
            .joinToString(" ")
    }

    private fun beginsWithVowel(a: String): Boolean {
        return when(a[0]) {
            'a','e','i','o','u' -> true
            'A','E','I','O','U' -> true
            else -> false
        }
    }
}