package q07

/**
 * No.796
 */
class `Rotate String` {

    fun rotateString(s: String, goal: String): Boolean {

        var tmp = s
        for (i in s) {
            if (tmp == goal) return true
            tmp = tmp.substring(1) + tmp[0]
        }

        return false
    }
}