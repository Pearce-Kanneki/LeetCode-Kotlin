package q10

/**
 * No.1103
 */
class `Distribute Candies to People` {

    fun distributeCandies(candies: Int, num_people: Int): IntArray {
        val ans = IntArray(num_people) {0}
        var count = 0
        var index = 1
        while (count <= candies) {
            ans[(index - 1) % num_people] +=
                if (count + index <= candies) index
                else candies - count

            count += index
            index++
        }

        return ans
    }
}