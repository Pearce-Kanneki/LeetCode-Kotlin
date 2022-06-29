package q00

/**
 * No.21
 */
class `Merge Two Sorted Lists` {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        return when {
            list1 == null -> list2
            list2 == null -> list1
            else -> {
                val (small, large) = if (list1.`val` < list2.`val`) {
                    list1 to list2
                } else {
                    list2 to list1
                }

                small.next = mergeTwoLists(small.next, large)
                small
            }
        }
    }

    /** 其他人優秀寫法 */
    fun mergeTwoLists2(list1: ListNode?, list2: ListNode?): ListNode? {
        val preHead: ListNode = ListNode(-1)
        var prev: ListNode = preHead

        var r: ListNode? = list1
        var c: ListNode? = list2

        while (r != null && c != null) {
            if (r.`val` <= c.`val`) {
                prev.next = r
                r = r?.next
            } else {
                prev.next = c
                c = c?.next
            }

            prev = prev.next!!
        }

        if (r == null) prev.next = c else prev.next = r

        return preHead.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}