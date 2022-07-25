package q05

import q00.TreeNode

/**
 * No.572
 */
class `Subtree of Another Tree` {

    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        return dfs(root, subRoot)
    }

    fun dfs(root: TreeNode?, subRoot: TreeNode?, isMain: Boolean = true): Boolean {

        if (root == null && subRoot == null) return true
        if (root == null || subRoot == null) return false
        if (root.`val` == subRoot.`val`) {
            if (dfs(root.left, subRoot.left, false) && dfs(root.right, subRoot.right, false))
                return true
        }

        return isMain && (dfs(root.left, subRoot) || dfs(root.right, subRoot))
    }
}