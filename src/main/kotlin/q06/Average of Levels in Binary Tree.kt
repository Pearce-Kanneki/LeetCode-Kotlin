package q06

import q00.TreeNode

/**
 * No.637
 */
class `Average of Levels in Binary Tree` {

    /**
     *
     */
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val counts = mutableListOf<Int>()
        val sum = mutableListOf<Double>()
        dfs(root, 0 , counts, sum)
        val ans = DoubleArray(sum.size)
        for (i in sum.indices) {
            ans[i] = sum[i] / counts[i]
        }

        return ans
    }

    private fun dfs(node: TreeNode?, level: Int, counts: MutableList<Int>, sums: MutableList<Double>) {
        if (node == null) return
        if (level < sums.size) {
            sums[level] += node.`val`.toDouble()
            counts[level]++
        } else {
            sums.add(node.`val`.toDouble())
            counts.add(1)
        }
        node.left?.let { dfs(it, level+ 1, counts, sums) }
        node.right?.let { dfs(it, level+ 1, counts, sums) }
    }
}