package q09

import java.util.LinkedList
import java.util.Queue

/**
 * No.933
 */
class `Number of Recent Calls` {
}

class RecentCounter() {

    private val q: Queue<Int> = LinkedList()

    fun ping(t: Int): Int {
        q.offer(t)
        while (q.peek() < t - 3000) {
            q.poll()
        }

        return q.size
    }

}