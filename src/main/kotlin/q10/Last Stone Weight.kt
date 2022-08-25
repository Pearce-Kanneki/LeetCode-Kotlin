package q10

import java.util.*

/**
 * No.1046
 */
class `Last Stone Weight` {

    /**
     *
     */
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(stones.size){ a, b ->
            b - a
        }
        stones.forEach{
            maxHeap.add(it)
        }
        while (maxHeap.size >= 2){
            val y = maxHeap.poll()
            val x = maxHeap.poll()
            if (y != x) {
                maxHeap.add(y - x)
            }
        }
        return maxHeap.poll() ?: 0
    }

    /**
     *
     */
    fun lastStoneWeight1(stones: IntArray): Int {
        if (stones.size == 1) return stones.first()
        for (i in stones.lastIndex downTo 1) {
            stones.sort()
            stones[i - 1] = stones[i] - stones[i - 1]
        }

        return stones[0]
    }
}