package q03

/**
 * No.345
 */
class `Reverse Vowels of a String` {

    fun reverseVowels(s: String): String {

        val changerChar = setOf<Char>('a','e','i','o','u','A','E','I','O','U')
        val changerRange = mutableListOf<Int>()

        for (i in s.indices) {
            val item = s[i]
            if (item in changerChar) {
                changerRange.add(i)
            }
        }

        var result = s.toCharArray()
        var leftIndex = 0
        var rightIndex = changerRange.size - 1
        while (leftIndex <= rightIndex) {
            val tmp = result[changerRange[leftIndex]]
            result[changerRange[leftIndex]] = result[changerRange[rightIndex]]
            result[changerRange[rightIndex]] = tmp
            leftIndex++
            rightIndex--
        }


        return String(result)
    }
}