package q09

import q00.TreeNode

/**
 * No.938
 */
class `Range Sum of BST` {

    /**
     *
     */
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return traverse(root, low, high)
    }

    private fun traverse(head: TreeNode?, low: Int, high: Int): Int {
        return if (head == null) {
            0
        } else if (head.left == null && head.right == null) {
            if (head.`val` in low..high) {
                head.`val`
            } else {
                0
            }
        } else {
            val current = if (head.`val` in low..high) {
                head.`val`
            } else {
                0
            }
            val left = traverse(head.left, low, high)
            val right = traverse(head.right, low, high)
            current + left + right
        }
    }

    /**
     *
     */
    fun rangeSumBST1(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0

        if (root.`val` > high) {
            return rangeSumBST1(root.left, low, high)
        }

        if (root.`val` < low) {
            return rangeSumBST1(root.right, low, high)
        }

        return root.`val` + rangeSumBST1(root.left, low, high) + rangeSumBST1(root.right, low, high)
    }
}