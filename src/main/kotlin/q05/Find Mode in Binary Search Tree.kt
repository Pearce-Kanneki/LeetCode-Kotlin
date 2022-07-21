package q05

import q00.TreeNode

/**
 * No.501
 */
class `Find Mode in Binary Search Tree` {

    val occs = mutableMapOf<Int, Int>()

    fun findMode(root: TreeNode?): IntArray {
        rec(root)
        val max = occs.values.maxOrNull()

        return occs.filter { it.value == max }.map { it.key }.toIntArray()
    }

    fun rec(root: TreeNode?) {
        if (root == null) return
        occs.merge(root.`val`, 1, Int::plus)
        rec(root.right)
        rec(root.left)
    }

    /**
     *
     */
    var count = 0
    var maxCount = 0
    var base = 0
    val ans = mutableListOf<Int>()
    fun findMode1(root: TreeNode?): IntArray {

        dfs(root)
        return ans.toIntArray()
    }

    fun dfs(node: TreeNode?) {

        if (node == null) return
        dfs(node.left)
        update(node.`val`)
        dfs(node.right)
    }

    fun update(x: Int) {

        if (x == base) {
            ++count
        } else {
            count = 1
            base = x
        }

        if (count == maxCount) {
            ans.add(x)
        }

        if (count > maxCount) {
            maxCount = count
            ans.clear()
            ans.add(x)
        }
    }
}