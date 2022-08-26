package q10

/**
 * No.1051
 */
class `Height Checker` {

    /**
     *
     */
    fun heightChecker(heights: IntArray): Int {
        val heightFreq = IntArray(101)

        for(height in heights) {
            heightFreq[height]++
        }

        var currentHeight = 0

        var result = 0
        for(height in heights) {

            while(heightFreq[currentHeight] == 0) {
                currentHeight++
            }

            if(currentHeight != height) {
                result += 1
            }

            heightFreq[currentHeight] -= 1
        }


        return result
    }

    /**
     *
     */
    fun heightChecker1(heights: IntArray): Int {
        val check = heights.sorted()
        var count = 0
        for (i in heights.indices) {
            if (heights[i] != check[i]) count++
        }

        return count
    }
}