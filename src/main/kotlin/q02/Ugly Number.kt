package q02

/**
 * No.263
 */
class `Ugly Number` {

    fun isUgly(n: Int): Boolean {

        if(n == 0) return false

        var result = n
        while (result % 2 == 0 || result % 3 == 0 || result % 5 == 0) {
            if (result % 2 == 0) result /= 2
            if (result % 3 == 0) result /= 3
            if (result % 5 == 0) result /= 5
        }

        return result == 1
    }
}