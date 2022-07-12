package q01

import q00.TreeNode

/**
 * No.110
 */
class `Balanced Binary Tree` {

    /**
     * 更快的解
     */
    fun isBalanced(root: TreeNode?): Boolean {
        if(root == null) return true
        val leftNodeHeight = heightOfNode(root.left)
        val rightNodeHeight = heightOfNode(root.right)
        if(Math.abs(leftNodeHeight - rightNodeHeight) > 1) {
            return false
        } else return isBalanced(root.left) && isBalanced(root.right)
    }


    fun heightOfNode(node: TreeNode?): Int  {
        if(node == null) return 0

        return 1 + Integer.max(heightOfNode(node.left), heightOfNode(node.right))

    }

    /**
     *
     */
    fun isBalanced1(root: TreeNode?): Boolean {

        if (root == null) return true
        return Math.abs(getHight(root.left) - getHight(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)
    }

    fun getHight(root: TreeNode?): Int {
        if (root == null) return 0
        return maxOf(getHight(root.left), getHight(root.right)) + 1
    }
}