package q04

/**
 * No.401
 */
class `Binary Watch` {

    fun readBinaryWatch(turnedOn: Int): List<String> {

        if (turnedOn > 10) return emptyList()
        val result = mutableListOf<String>()
        for(h in 0 until 12) {
            val hString = Integer.bitCount(h)
            for (d in 0 until 60) {
                if (hString + Integer.bitCount(d) == turnedOn) {
                    val dd = if (d < 10) "0$d" else d
                    result.add("$h:$dd")
                }
            }
        }

        return result
    }
}