package q06

import q00.TreeNode

/**
 * No.653
 */
class `Two Sum IV - Input is a BST` {

    /**
     * 較快的方法
     */
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val values = HashSet<Int>()
        fun search(node: TreeNode?): Boolean {
            if (node == null) return false
            if (k - node.`val` in values) return true
            values.add(node.`val`)
            return search(node.left) || search(node.right)
        }
        return search(root)
    }

    /**
     *
     */
    val set = HashSet<Int>()
    fun findTarget1(root: TreeNode?, k: Int): Boolean {
        if (root == null) return false
        if (set.contains(k - root.`val`)) {
            return true
        } else {
            set.add(root.`val`)
        }

        return findTarget1(root.left, k) || findTarget1(root.right, k)
    }
}