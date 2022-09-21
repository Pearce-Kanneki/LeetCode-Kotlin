package q12

/**
 * No.1281
 */
class `Subtract the Product and Sum of Digits of an Integer` {

    fun subtractProductAndSum(n: Int): Int {
        var add = 0
        var mu = 1
        var sum = n

        while (sum > 0) {
            val d = sum % 10
            add += d
            mu *= d
            sum /= 10
        }

        return mu - add
    }
}