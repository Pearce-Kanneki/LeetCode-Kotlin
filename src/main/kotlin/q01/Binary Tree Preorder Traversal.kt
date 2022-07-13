package q01

import q00.TreeNode

/**
 * No.144
 */
class `Binary Tree Preorder Traversal` {

    /**
     * 較快的方法
     */
    private val ret: MutableList<Int> = mutableListOf()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) {
            return ret
        }
        ret.add(root.`val`)
        preorderTraversal(root.left)
        preorderTraversal(root.right)
        return ret
    }

    /**
     *
     */
    fun preorderTraversal1(root: TreeNode?): List<Int> {

        if (root == null) return emptyList()
        val result = mutableListOf<Int>()
        preorder(root, result)
        return result
    }

    fun preorder(root: TreeNode, res: MutableList<Int>) {
        res.add(root.`val`)
        root.left?.let { preorder(it, res) }
        root.right?.let { preorder(it, res) }
    }
}