package q02

import q00.ListNode

/**
 * No.237
 */
class `Delete Node in a Linked List` {

    /**
     * !!寫法
     */
    fun deleteNode(node: ListNode?) {

        // make the current node hold the value of the next node
        node!!.`val` = node!!.next!!.`val`

        // skip the next node
        node!!.next = node!!.next!!.next

    }

    fun deleteNode1(node: ListNode?) {

        node?.next?.`val`?.let {
            node.`val` = it
        }

        node?.next = node?.next?.next
    }
}