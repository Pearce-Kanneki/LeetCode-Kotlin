package q06

/**
 * No.605
 */
class `Can Place Flowers` {

    /**
     * 較快的方法
     */
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var numCanBePlaced = 0
        val bedSize = flowerbed.size
        var count = 0

        flowerbed.forEachIndexed { i, value ->
            if (numCanBePlaced >= n) { return true }
            val left = if (i == 0) 0 else flowerbed[i - 1]
            val right = if (i == bedSize - 1) 0 else flowerbed[i + 1]

            if (left == 0 && right == 0 && value == 0) {
                flowerbed[i] = 1
                numCanBePlaced += 1
            }
        }
        return numCanBePlaced >= n
    }

    /**
     * 較省的方法
     */
    fun canPlant(flowerbed: IntArray, cur: Int): Boolean {
        var prev = cur - 1
        var next = cur + 1

        if (cur == 0) {
            if (next < flowerbed.size) {
                return flowerbed[cur] == 0 && flowerbed[next] == 0
            } else {
                return flowerbed[cur] == 0
            }
        } else {
            if (next < flowerbed.size) {
                return return flowerbed[prev] == 0 && flowerbed[cur] == 0 && flowerbed[next] == 0
            } else {
                return flowerbed[prev] == 0 &&  flowerbed[cur] == 0
            }
        }
    }

    fun canPlaceFlowers1(flowerbed: IntArray, n: Int): Boolean {
        var copy = n

        for(i in flowerbed.indices) {
            if (canPlant(flowerbed, i)) {
                flowerbed[i] = 1
                if (copy > 0)
                    copy--
            }
        }

        return copy == 0
    }

    /**
     *
     */
    fun canPlaceFlowers2(flowerbed: IntArray, n: Int): Boolean {

        var check = n
        for (i in flowerbed.indices) {
            if (check == 0) break
            when {
                i == 0 && flowerbed[0] == 0 -> {
                    if (flowerbed.size == 1) {
                        check--

                    } else if (flowerbed[1] == 0) {
                        check--
                        flowerbed[i] = 1
                    }
                }
                i == flowerbed.lastIndex && flowerbed[i] == 0 && flowerbed[i - 1] == 0 -> {
                    check--
                }
                flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 -> {
                    check--
                    flowerbed[i] = 1
                }
            }
        }

        return check == 0
    }
}