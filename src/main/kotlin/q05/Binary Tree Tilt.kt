package q05

import q00.TreeNode

/**
 * No.563
 */
class `Binary Tree Tilt` {

    /**
     * 較快的方法
     */
    private val tilts = mutableListOf<Int>()

    fun findTilt(root: TreeNode?): Int {
        dfs(root)
        return this.tilts.sum()
    }

    fun dfs(node: TreeNode?): Int {
        var sum = 0
        // postorder
        if (node == null) return sum
        var leftTreeSum = dfs(node.left)
        var rightTreeSum = dfs(node.right)
        sum += node.`val` + leftTreeSum + rightTreeSum
        this.tilts.add(Math.abs(rightTreeSum-leftTreeSum))
        // println(this.tilts)
        return sum
    }

    /**
     *
     */
    var ans = 0
    fun findTilt1(root: TreeNode?): Int {

        dfs1(root)
        return ans
    }

    private fun dfs1(node: TreeNode?): Int {

        if (node == null) return 0
        val leftSum = dfs1(node.left)
        val rightSum = dfs1(node.right)
        ans += Math.abs(leftSum - rightSum)
        return leftSum + rightSum + node.`val`
    }
}