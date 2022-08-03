package q07

import java.util.PriorityQueue

/**
 * No.703
 */
class `Kth Largest Element in a Stream` {

    inner class KthLargest(val k: Int, nums: IntArray) {

        private val heap: PriorityQueue<Int> = PriorityQueue()

        init {
            nums.forEach { heap.offer(it) }
            while (heap.size > k)
                heap.poll()
        }

        fun add(`val`: Int): Int {
            heap.offer(`val`)
            if (heap.size > k) heap.poll()

            return heap.peek()
        }

    }
}