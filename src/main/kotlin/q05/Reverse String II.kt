package q05

/**
 * No.541
 */
class `Reverse String II` {

    fun reverseStr(s: String, k: Int): String {

        val cs = s.toCharArray()
        var i = 0
        while (i < s.length) {
            val r = i + k - 1
            reverse(cs, i , Math.min(r, s.length - 1))
            i += 2 * k
        }

        return String(cs)
    }

    private fun reverse(cs: CharArray, l: Int, r: Int) {

        var ll = l
        var rr = r

        while (ll < rr) {
            val c = cs[ll]
            cs[ll] = cs[rr]
            cs[rr] = c
            ll++
            rr--
        }
    }
}