package q07

/**
 * No.762
 */
class `Prime Number of Set Bits in Binary Representation` {

    fun countPrimeSetBits(left: Int, right: Int): Int {
        return (left..right).filter { isPrime(setBits(it)) }.size
    }

    private fun setBits(x: Int): Int {
        var ones = 0
        var num = x
        while (num > 0) {
            ones++
            num = num and (num - 1)
        }
        return ones
    }

    private fun isPrime(x: Int): Boolean {
        return x > 1 && (2 until x).none { x % it == 0 }
    }
}