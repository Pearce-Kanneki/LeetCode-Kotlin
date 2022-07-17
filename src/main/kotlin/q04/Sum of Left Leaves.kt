package q04

import q00.TreeNode

/**
 * No.404
 */
class `Sum of Left Leaves` {

    fun sumOfLeftLeaves(root: TreeNode?): Int {

        if (root == null) return 0
        var result = 0
        root.left?.let {
            result += if (it.left == null && it.right == null) {
                it.`val`
            } else {
                sumOfLeftLeaves(it)
            }
        }

        if (root.right != null)
            result += sumOfLeftLeaves(root.right)

        return result
    }


}