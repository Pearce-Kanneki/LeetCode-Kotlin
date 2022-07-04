package q01

import kotlin.math.pow

/**
 * No.171
 */
class `Excel Sheet Column Number` {

    /**
     * 較快的解
     */
    fun titleToNumber(cl: String): Int {
        var sum = 0
        for(c in cl.toUpperCase().toCharArray()){
            sum *= 26
            sum += c - 'A' + 1
        }
        return sum
    }

    fun titleToNumber1(columnTitle: String): Int {

        var result = 0
        columnTitle.reversed().forEachIndexed { index, c ->

            result += (c - 'A' + 1) * 26f.pow(index.toFloat()).toInt()
        }

        return result
    }

    /**
     * 改良版
     */
    fun titleToNumber2(columnTitle: String): Int {

        var result = 0
        columnTitle.forEach {

            result *= 26
            result += (it - 'A' + 1)
        }

        return result
    }
}