package q10

import q00.TreeNode

/**
 * No.1022
 */
class `Sum of Root To Leaf Binary Numbers` {

    /**
     *
     */
    fun sumRootToLeaf1(root: TreeNode?): Int {
        return dfs(root, 0)
    }

    private fun dfs(node: TreeNode?, n: Int): Int {
        var ans = 0
        val ncur = (n shl 1) + (node?.`val` ?: 0)

        node?.left?.let {
            ans += dfs(it, ncur)
        }

        node?.right?.let {
            ans += dfs(it, ncur)
        }

        return if (node?.left == null && node?.right == null) ncur else ans
    }
}