package q09

/**
 * No.925
 */
class `Long Pressed Name` {

    /**
     *
     */
    fun isLongPressedName(name: String, typed: String): Boolean {

        if (name.length > typed.length) return false
        var i = 0
        var j = 0
        while (i < name.length && j < typed.length) {
            if (name[i] == typed[j]) {
                if (i + 1 < name.length && name[i+1]==name[i]) {
                    i++
                    j++
                } else if (j + 1 < typed.length && typed[j+1] == typed[j]) {
                    j++
                } else {
                    i++
                    j++
                }
            } else {
                return false
            }
        }
        return (i == name.length && j == typed.length)
    }
}