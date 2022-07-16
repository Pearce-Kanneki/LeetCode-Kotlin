package q01

import q00.ListNode

/**
 * No.160
 */
class `Intersection of Two Linked Lists` {

    fun getIntersectionNode(headA: ListNode?, headB:ListNode?):ListNode? {

        if (headA == null || headB == null) return null
        var pA = headA
        var pB = headB
        var pALoop = false
        var pBLoop = false
        while (pA != pB) {
            pA = if (pA?.next == null && !pALoop){
                pALoop = true
                headB
            } else pA?.next
            pB = if (pB?.next == null && !pBLoop){
                pBLoop = true
                headA
            } else pB?.next
        }

        return pA
    }
}