package q01

/**
 * No.191
 */
class `Number of 1 Bits` {

    /**
     * 較快的解
     */
    fun hammingWeight(n:Int):Int {
        var num = n
        var oneCount = 0

        while (num != 0) {
            oneCount += Math.abs(num % 2)
            num = num ushr 1
        }

        return oneCount
    }

    fun hammingWeight1(n:Int):Int {

        var tmp = n
        var result = 0

        while (tmp != 0) {
            result += tmp and 1
            tmp = tmp ushr 1
        }

        return result
    }
}