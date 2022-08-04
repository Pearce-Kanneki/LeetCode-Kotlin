package q07

/**
 * No.728
 */
class `Self Dividing Numbers` {

    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val result = mutableListOf<Int>()
        for (num in left..right) {
            var tmpNum = num
            while (tmpNum > 0) {
                val check = tmpNum % 10
                if (check == 0 || num % check != 0) {
                    break
                }
                tmpNum /= 10
            }
            if (tmpNum == 0) result.add(num)
        }

        return result
    }
}