package q04

/**
 * No.482
 */
class `License Key Formatting` {

    fun licenseKeyFormatting(s: String, k: Int): String {

        val sb = StringBuilder()
        s.forEach {
            if (it != '-') {
                sb.append(it.toUpperCase())
            }
        }

        for (i in sb.length-1 downTo 0 step k) {
            if (i != sb.length - 1) {
                sb.insert(i + 1, '-')
            }
        }

        return sb.toString()
    }
}