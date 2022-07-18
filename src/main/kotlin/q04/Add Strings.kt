package q04

/**
 * No.415
 */
class `Add Strings` {

    fun addStrings(num1: String, num2: String): String {

        val sb = StringBuilder()
        val tmpNum1 = num1.reversed().toCharArray()
        val tmpNum2 = num2.reversed().toCharArray()

        var m = 0
        var index = 0
        while (index < tmpNum1.size || index < tmpNum2.size) {

            val char1 = if (index < tmpNum1.size) tmpNum1[index] - '0' else 0
            val char2 = if (index < tmpNum2.size) tmpNum2[index] - '0' else 0

            (char1 + char2 + m + '0'.toInt()).also {

                if (it > '9'.toInt()) {
                    m = 1
                    sb.append((it - 10).toChar())
                } else {
                    m = 0
                    sb.append(it.toChar())
                }
            }

            index++
        }

        if (m > 0) sb.append('1')

        return sb.reverse().toString()
    }
}