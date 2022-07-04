package q01

/**
 * No.190
 */
class `Reverse Bits` {


    /**
     * 較快且精簡的寫法
     */
    fun reverseBits1(n:Int):Int {
        var result = 0
        for(i in 0..31){
            val r = n.shr(i) and 1
            result = result or r.shl(31 - i)
        }
        return result
    }

    /**
     * 為雲運算分治
     */
    fun reverseBits(n:Int):Int {

        val m1 = 0x55555555 // 01010101010101010101010101010101
        val m2 = 0x33333333 // 00110011001100110011001100110011
        val m4 = 0x0f0f0f0f // 00001111000011110000111100001111
        val m8 = 0x00ff00ff // 00000000111111110000000011111111

        var result = n

        result = ((result ushr 1) and m1) or ((result and m1) shl 1)
        result = ((result ushr 2) and m2) or ((result and m2) shl 2)
        result = ((result ushr 4) and m4) or ((result and m4) shl 4)
        result = ((result ushr 8) and m8) or ((result and m8) shl 8)

        return (result ushr 16) or (result shl 16)
    }

    /**
     * 循環解法
     */
    fun reverseBits2(n: Int): Int {

        if (n == 0) return 0

        var numberN = n
        var sum = 0

        for (i in 0 until 32) {

            sum = sum shl 1
            sum += numberN and 1

            numberN = numberN shr 1
        }

        return sum
    }
}