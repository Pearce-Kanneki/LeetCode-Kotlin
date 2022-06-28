package q00xx

/**
 * No.14
 */
class `Longest Common Prefix` {

    /**
     * 參考別人提的方案,最佳解
     */
    fun longestCommonPrefix(strs: Array<String>): String {

        if (strs.size <= 1) return strs.firstOrNull().orEmpty()
        var index = 0
        while (true) {
            for (i in strs) {
                if (index >= i.length || i[index] != strs[0][index]) {
                    return strs[0].substring(0, index)
                }
            }
            index++
        }

    }

    /**
     * 參考別人提的方案,一行解決
     */
    fun longestCommonPrefix2(strs: Array<String>): String {
        return if(strs.size == 0){""}else{strs.reduce{a, b -> a.commonPrefixWith(b)}}
    }

    /**
     * 笨方法
     */
    fun longestCommonPrefix3(strs: Array<String>): String {

        var resultList = listOf<String>()

        if (strs.size == 1) {
            return strs.first()
        }

        for (i in strs.indices) {
            when(i) {
                0 -> {}
                1 -> {
                    val tmp = strs[0]
                    for (j in 0..tmp.length) {
                        if (strs[i].indexOf(tmp.substring(0, j)) == 0) {
                            resultList += tmp.substring(0, j)
                        }
                    }
                }
                else -> {
                    if (resultList.none()) {
                        return ""
                    }

                    var tmp = listOf<String>()

                    resultList.forEach { item ->
                        if (item.isNotBlank() && strs[i].indexOf(item) == 0) {
                            tmp += item
                        }
                    }

                    resultList = tmp
                }
            } // end when
        } // end for

        if (resultList.none()) return ""
        return resultList.sortedByDescending { it.length }.first()

    }

    // 寫到其他東西了
    fun other(strs: Array<String>): String {
        var tmpList = listOf<String>()
        var sum = listOf<String>()

        if (strs.size == 1) {
            return strs.first()
        }

        for (i in strs.indices) {
            when(i) {
                0 -> {
                    tmpList = strs[i].split("")
                }
                1 -> {
                    var tmp = ""
                    tmpList.forEach { item ->
                        if (item.isNotBlank() && strs[i].indexOf(item) >= 0) {
                            sum += item
                            if (tmp.isNotBlank()) {
                                tmp += item
                            } else {
                                tmp = item
                            }

                            if (strs[i].indexOf(tmp) >= 0) {
                                sum += tmp
                            }
                        } else {
                            tmp = ""
                        }
                    }
                }
                else -> {
                    if (sum.none()) return ""
                    var tmp = listOf<String>()
                    sum.forEach { item ->
                        if (strs[i].indexOf(item) >= 0) {
                            tmp += item
                        }
                    }
                    sum = tmp
                }
            } // end when
        } // end for

        if (sum.none()) return ""
        return sum.sortedByDescending { it.length }.first()

    }
}