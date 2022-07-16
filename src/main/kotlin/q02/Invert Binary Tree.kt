package q02

import q00.TreeNode

/**
 * No.226
 */
class `Invert Binary Tree` {

    /**
     * 較快的方法
     */
    fun invertTree(root: TreeNode?): TreeNode? {
        tailrecInvertTree(root)
        return root
    }

    private fun tailrecInvertTree(root: TreeNode?) {
        if (root?.left == null && root?.right == null) return
        val tmp = root.left
        root.left = root.right
        root.right = tmp
        tailrecInvertTree(root.right)
        tailrecInvertTree(root.left)
    }

    /**
     *
     */
    fun invertTree1(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val tmp = root.left?.run { invertTree(this) }
        root.left = invertTree(root.right)
        root.right = tmp

        return root
    }
}