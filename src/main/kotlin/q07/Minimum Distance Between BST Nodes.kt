package q07

import q00.TreeNode

/**
 * No.783
 */
class `Minimum Distance Between BST Nodes` {

    var pre = -1
    var ans = Int.MAX_VALUE

    fun minDiffInBST(root: TreeNode?): Int {
        dfs(root)
        return ans
    }

    private fun dfs(root: TreeNode?) {
        if (root == null) return

        dfs(root.left)
        if (pre == -1) {
            pre = root.`val`
        } else {
            ans = Math.min(ans, root.`val` - pre)
            pre = root.`val`
        }
        dfs(root.right)
    }
}