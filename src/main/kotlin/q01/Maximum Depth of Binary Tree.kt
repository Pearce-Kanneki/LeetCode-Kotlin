package q01

import q00.TreeNode

/**
 * N0.104
 */
class `Maximum Depth of Binary Tree` {

    /**
     * 更快的解
     */
    fun maxDepth(root: TreeNode?): Int {
        return if (root != null) maxOf(maxDepth(root.left), maxDepth(root.right)) + 1 else 0
    }

    fun maxDepth1(root: TreeNode?): Int = when(root) {
        null -> 0
        else -> 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }

    fun maxDepth2(root: TreeNode?): Int {
        return when {
            root?.`val` == null -> 0
            root.left == null && root.right == null -> 1
            root.left == null -> maxDepth(root.right) + 1
            root.right == null -> maxDepth(root.left) + 1
            else -> maxOf(maxDepth(root.left), maxDepth(root.right)) + 1
        }
    }
}