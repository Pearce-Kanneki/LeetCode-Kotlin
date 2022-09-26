package q17

/**
 * No.1768
 */
class `Merge Strings Alternately` {

    /**
     *
     */
    fun mergeAlternately(word1: String, word2: String): String {
        var strBuild = StringBuilder()

        for( i in word1.indices){
            strBuild.append(word1[i])
            if(i<word2.length) strBuild.append(word2[i])
        }
        for(j in word1.length until word2.length) strBuild.append(word2[j])
        return strBuild.toString()
    }
    
    /**
     *
     */
    fun mergeAlternately1(word1: String, word2: String): String {
        val ans = StringBuffer()
        var index = 0
        while (index < word1.length || index < word2.length) {
            if (index < word1.length) {
                ans.append(word1[index])
            }

            if (index < word2.length) {
                ans.append(word2[index])
            }

            index++
        }

        return ans.toString()
    }
}