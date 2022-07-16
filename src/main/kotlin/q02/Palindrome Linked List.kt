package q02

import q00.ListNode

/**
 * No.234
 */
class `Palindrome Linked List` {

    fun isPalindrome(head: ListNode?): Boolean {

        var check = head
        val result = mutableListOf<Int>()

        while (check != null) {
            result.add(check.`val`)
            check = check.next
        }

        return result == result.reversed()
    }
}