package q12

import q00.ListNode

/**
 * No.1290
 */
class `Convert Binary Number in a Linked List to Integer` {

    fun getDecimalValue(head: ListNode?): Int {
        var sum = 0.0
        var power = 0.0
        var current = reverse(head)

        while(current != null) {
            sum += current.`val` * Math.pow(2.0, power++)
            current = current.next
        }
        return sum.toInt()
    }

    fun reverse(node: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current = node
        while(current != null) {
            val temp = current.next
            current.next = previous
            previous = current
            current = temp
        }
        return previous
    }
}