package q02

import q00.ListNode

/**
 * No.206
 */
class `Reverse Linked List` {

    fun reverseList(head: ListNode?): ListNode? {

        var per: ListNode? = null
        var curr = head

        while (curr != null) {
            val next = curr.next
            curr.next = per
            per = curr
            curr = next
        }

        return per
    }
}