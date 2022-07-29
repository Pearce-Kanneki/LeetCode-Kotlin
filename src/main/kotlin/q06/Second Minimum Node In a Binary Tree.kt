package q06

import q00.TreeNode

/**
 * No.671
 */
class `Second Minimum Node In a Binary Tree` {

    fun findSecondMinimumValue(root: TreeNode?): Int {
        val result = intArrayOf(-1, -1)
        getValue(root, result)

        return result[1]
    }

    private fun getValue(node: TreeNode?, ints: IntArray) {
        if (node == null) return
        if (ints[0] == -1 || node.`val` < ints[0]) {
            ints[1] = ints[0]
            ints[0] = node.`val`
        } else if (node.`val` > ints[0] && (node.`val` < ints[1] || ints[1] == -1)) {
            ints[1] = node.`val`
        }

        node.left?.let { getValue(it, ints) }
        node.right?.let { getValue(it, ints) }
    }
}