package q02

import q00.ListNode

/**
 * No.203
 */
class `Remove Linked List Elements` {

    /**
     * 比較快的方法
     */
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var node: ListNode? = ListNode(-1)
        node?.next = head
        val start = ListNode(-1)
        start.next = node
        while (node?.next != null) {
            while (node?.next?.`val` == `val`) {
                node.next = node.next.next
            }
            node = node?.next
        }
        return start.next.next
    }

    fun removeElements1(head: ListNode?, `val`: Int): ListNode? {

        if (head == null) return null
        var result = head
        if (result.`val` == `val`) result = removeElements(result.next, `val`)
        if (result?.next?.`val` == `val`) result.next = removeElements(result.next?.next, `val`)
        if (result?.next != null) {
            result.next = removeElements(result.next, `val`)
        }

        return result
    }
}