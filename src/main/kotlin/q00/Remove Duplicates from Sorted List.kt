package q00

/**
 * No.83
 */
class `Remove Duplicates from Sorted List` {

    /**
     *  較快的解
     */
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var cur = head
        while (cur != null && cur.next != null) {
            if (cur.`val` == cur.next?.`val`) {
                cur.next = cur.next?.next
            } else {
                cur = cur.next
            }

        }
        return head
    }

    fun deleteDuplicates1(head: ListNode?): ListNode? {

        var pre = head
        val result = pre

        while (pre != null) {
            if (pre.next?.`val` == pre.`val`) {
                pre.next = pre.next?.next
                continue
            }
            pre = pre.next
        }

        return result
    }
}