package q07

/**
 * No.709
 */
class `To Lower Case` {

    /**
     *  one line
     *  最快解
     */
    fun toLowerCase(s: String): String {
        return s.toLowerCase()
    }

    fun toLowerCase1(s: String): String {
        var result=""
        for( c in s){
            if(c.toInt()>=65 && c.toInt()<=90)
                result+=(c.toInt()+32).toChar()
            else
                result+= c.toInt().toChar()
        }
        return result
    }

    /**
     *
     */
    fun toLowerCase2(s: String): String {
        val aCode = 'a'.toInt()
        val ACode = 'A'.toInt()
        val sb = StringBuffer()

        s.forEach {
            if (it.toInt() - ACode >= 0 && it.toInt() - ACode < 26) {
                sb.append(
                    (it.toInt() - ACode + aCode).toChar()
                )
            } else {
                sb.append(it)
            }
        }

        return sb.toString()
    }
}