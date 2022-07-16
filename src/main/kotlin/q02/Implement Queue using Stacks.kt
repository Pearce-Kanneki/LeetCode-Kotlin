package q02

import java.util.*

/**
 * No.232
 */
class `Implement Queue using Stacks` {

    private val queue = mutableListOf<Int>()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        val first = queue.first()
        queue.removeAt(0)
        return first
    }

    fun peek(): Int {
        return queue.first()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }
}

/**
 * 較快的解
 */
class MyQueue() {

    private val firstStack = Stack<Int>()
    private val secondStack = Stack<Int>()

    fun push(x: Int) {
        firstStack.push(x)
    }

    fun pop(): Int {
        secondStack.clear()
        while (firstStack.isNotEmpty()) {
            secondStack.push(firstStack.pop())
        }

        val value = secondStack.pop()

        while (secondStack.isNotEmpty()) {
            firstStack.push(secondStack.pop())
        }

        return value
    }

    fun peek(): Int {
        secondStack.clear()

        while (firstStack.isNotEmpty()) {
            secondStack.push(firstStack.pop())
        }

        val value = secondStack.peek()

        while (secondStack.isNotEmpty()) {
            firstStack.push(secondStack.pop())
        }

        return value
    }

    fun empty(): Boolean {
        return firstStack.isEmpty()
    }

}
