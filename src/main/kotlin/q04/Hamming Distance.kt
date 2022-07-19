package q04

/**
 * No.461
 */
class `Hamming Distance` {

    fun hammingDistance(x: Int, y: Int): Int {

        return Integer.bitCount(x xor y)
    }

    fun hammingDistance1(x: Int, y: Int): Int {

        var s = x xor y
        var ret = 0
        while (s != 0) {
            ret += s and 1
            s = s ushr 1
        }

        return ret
    }
}