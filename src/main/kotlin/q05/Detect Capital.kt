package q05

/**
 * No.520
 */
class `Detect Capital` {

    fun detectCapitalUse(word: String): Boolean {

        var isAllUpper = true
        var isAllLowerOrFirstUpper = true


        for (i in word.indices) {
            val check = word[i] - 'A' < 26

            if (i == 0) {
                isAllUpper = check
            } else {
                isAllLowerOrFirstUpper = isAllLowerOrFirstUpper && !check
                isAllUpper = isAllUpper && check
            }
        }

        return isAllUpper || isAllLowerOrFirstUpper
    }
}