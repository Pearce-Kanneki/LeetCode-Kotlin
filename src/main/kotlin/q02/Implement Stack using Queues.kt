package q02

/**
 * No.225
 */
class `Implement Stack using Queues` {

    private val queue = LinkedList<Int>()

    fun push(x: Int) {
        queue.push(x)
    }

    fun pop(): Int {
        return queue.pop()
    }

    fun top(): Int {
        return queue.element()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}