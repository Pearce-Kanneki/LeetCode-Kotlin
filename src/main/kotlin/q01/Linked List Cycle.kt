package q01

import q00.ListNode

/**
 * No.141
 */
class `Linked List Cycle` {

    fun hasCycle(head: ListNode?): Boolean {

        if (head == null) return false
        var result = head
        val set = HashSet<ListNode>()
        while (result != null) {
            if (!set.add(result)) {
                return true
            }
            result = result.next
        }
        return false
    }

    /** Floyd判圈算法(龜兔賽跑) */
    fun hasCycle1(head: ListNode?): Boolean {

        if (head?.next == null) return false

        var slow = head
        var fast = head.next
        while (slow != fast) {
            if (fast?.next == null) return false
            slow = slow?.next
            fast = fast.next?.next
        }

        return true
    }
}