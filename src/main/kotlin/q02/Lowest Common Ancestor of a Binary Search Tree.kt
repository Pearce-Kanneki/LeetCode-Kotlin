package q02

import q00.TreeNode

/**
 * No.235
 */
class `Lowest Common Ancestor of a Binary Search Tree` {

    /**
     * 快又省的方法
     *
     * 非遞歸方法
     */
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        if (root == null || p == null || q == null) return null
        var result = root
        while (result != null && (result.`val` - p.`val`) * (result.`val` - q.`val`) > 0) {
            result = if (p.`val` < result.`val`) result.left else result.right
        }

        return result
    }

    fun lowestCommonAncestor1(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        if (root == null || p == null || q == null) return null
        var ancestor = root
        while (true) {
            if (ancestor != null) {
                ancestor = if (p.`val` < ancestor.`val` && q.`val` < ancestor.`val`) {
                    ancestor.left
                } else if (p.`val` > ancestor.`val` && q.`val` > ancestor.`val`) {
                    ancestor.right
                } else break

            } else break
        }

        return ancestor
    }
}