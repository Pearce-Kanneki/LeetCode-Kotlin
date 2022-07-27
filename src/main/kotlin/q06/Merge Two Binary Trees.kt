package q06

import q00.TreeNode

/**
 * No.617
 */
class `Merge Two Binary Trees` {

    /**
     * 較快的方法
     */
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null) return t2
        if (t2 == null) return t1

        t1.`val` += t2.`val`

        t1.left = mergeTrees(t1.left, t2.left)
        t1.right = mergeTrees(t1.right, t2.right)

        return t1
    }

    /**
     *
     */
    fun mergeTrees1(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null
        return TreeNode((root1?.`val` ?: 0) + (root2?.`val` ?: 0)).apply {
            left = mergeTrees(root1?.left, root2?.left)
            right = mergeTrees(root1?.right, root2?.right)
        }
    }
}