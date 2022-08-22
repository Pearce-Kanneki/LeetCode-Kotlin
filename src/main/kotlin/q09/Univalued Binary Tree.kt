package q09

import q00.TreeNode

/**
 * No.965
 */
class `Univalued Binary Tree` {
    
    /**
     *
     */
    fun isUnivalTree(root: TreeNode?): Boolean {
        return helper(root, root?.`val`)
    }

    private fun helper(root: TreeNode?, value: Int?): Boolean {
        if(root == null) return true
        if(root.`val` != value) return false
        return helper(root.left, value) && helper(root.right, value)
    }

    /**
     *
     */
    fun isUnivalTree1(root: TreeNode?): Boolean {
        if (root == null) return true
        val left = root.left == null || root.`val` == root.left!!.`val`
        val right = root.right == null || root.`val` == root.right!!.`val`
        if (left && right) return isUnivalTree1(root.left) && isUnivalTree1(root.right)

        return false
    }
}