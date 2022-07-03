package q01

/**
 * No.168
 */
class `Excel Sheet Column Title` {

    /**
     * 較快的解
     */
    fun convertToTitle(columnNumber: Int): String {
        val sb = StringBuilder()
        var cn = columnNumber
        while(cn != 0) {
            val remain = (cn-1) % 26
            sb.append('A' + remain)
            cn = (cn-1) / 26
        }
        return sb.reverse().toString()
    }

    /**
     * 別人的方法
     */
    fun convertToTitle1(columnNumber: Int): String {
        val c = columnNumber - 1
        return if (c < 26) {
            ('A' + c).toString()
        } else {
            return convertToTitle(c / 26) + convertToTitle((c % 26) +1)
        }
    }

    fun convertToTitle2(columnNumber: Int): String {

        var result = ""
        var tmpNumber = columnNumber

        while (tmpNumber > 0) {

            if (tmpNumber % 26 == 0){
                result = "Z$result"
                tmpNumber = tmpNumber / 26 - 1

            } else{
                result = ('A'.toInt() + (tmpNumber % 26) - 1).toChar() + result
                tmpNumber /= 26
            }
        }

        return result
    }
}