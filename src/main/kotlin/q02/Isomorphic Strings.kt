package q02

/**
 * No.205
 */
class `Isomorphic Strings` {

    fun isIsomorphic(s: String, t: String): Boolean {

        val sMap = HashMap<Char,Int>()
        val tMap = HashMap<Char,Int>()
        var index = 0
        for (i in s.indices) {
            if (sMap[s[i]] != tMap[t[i]]) {
                return false
            }

            if (sMap[s[i]] == null) {
                index++
                sMap[s[i]] = index
                tMap[t[i]] = index
            }
        }

        return true
    }

    /**
     * 他人不錯的解
     */
    fun isIsomorphic1(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sAry = s.toCharArray()
        val tAry = t.toCharArray()

        val mappingS2T = HashMap<Char, Char>()
        val mappingT2S = HashMap<Char, Char>()

        for (i in sAry.indices) {
            val sChar = sAry[i]
            val tChar = tAry[i]

            val s2tMappingChar = mappingS2T[sChar]
            val t2sMappingChar = mappingT2S[tChar]

            if (s2tMappingChar == null && t2sMappingChar == null) {
                mappingS2T[sChar] = tChar
                mappingT2S[tChar] = sChar
            } else if (tChar != s2tMappingChar || sChar != t2sMappingChar) {
                return false
            }
        }

        return true
    }
}