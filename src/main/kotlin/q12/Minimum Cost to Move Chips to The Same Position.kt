package q12

/**
 * No.1217
 */
class `Minimum Cost to Move Chips to The Same Position` {

    fun minCostToMoveChips(position: IntArray): Int {
        var event = 0
        var odd = 0
        position.forEach {
            if ((it and 1) != 0) odd++ else event++
        }

        return minOf(odd, event)
    }
}