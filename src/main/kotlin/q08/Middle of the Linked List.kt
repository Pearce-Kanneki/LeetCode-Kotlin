package q08

import q00.ListNode

/**
 * No.876
 */
class `Middle of the Linked List` {

    /**
     *
     */
    fun middleNode(head: ListNode?): ListNode? {
        var slowPtr: ListNode? = head
        var fastPtr: ListNode? = head?.next

        while(fastPtr != null) {
            slowPtr = slowPtr?.next
            fastPtr = fastPtr?.next?.next
        }
        return slowPtr
    }

    /**
     *
     */
    fun middleNode1(head: ListNode?): ListNode? {

        var fast = head
        var slow = head

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }

        return slow
    }
}