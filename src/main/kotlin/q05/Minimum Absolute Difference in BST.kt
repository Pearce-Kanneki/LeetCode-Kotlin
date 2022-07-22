package q05

import q00.TreeNode

/**
 * No.530
 */
class `Minimum Absolute Difference in BST` {

    val dfsList = mutableListOf<Int>()
    fun getMinimumDifference(root: TreeNode?): Int {

        dfs(root)
        dfsList.sort()
        var result = Int.MAX_VALUE
        for (i in dfsList.indices) {
            if (i == 0) continue

            result = Math.min(result, Math.abs(dfsList[i] - dfsList[i - 1]))
            if (result == 1) break
        }

        return result
    }

    private fun dfs(root: TreeNode?) {
        if (root != null) dfsList.add(root.`val`)
        root?.left?.let { dfs(it) }
        root?.right?.let { dfs(it) }
    }
}