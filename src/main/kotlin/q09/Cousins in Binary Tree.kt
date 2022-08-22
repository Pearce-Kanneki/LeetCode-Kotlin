package q09

import q00.TreeNode
import java.util.*

/**
 * No.993
 */
class `Cousins in Binary Tree` {

    /**
     *
     */
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false

        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.offer(root)

        while(!queue.isEmpty()) {
            val size = queue.size
            var xExists = false
            var yExists = false

            for (i in 0 until size) {
                val current = queue.poll()

                if (current != null) {
                    if (current.`val` == x) xExists = true
                    if (current.`val` == y) yExists = true
                    if (current.left != null && current.right != null) {
                        if (current.left.`val` == x && current.right.`val` == y || current.left.`val` == y && current.right.`val` == x) return false
                    }

                    if (current.left != null) queue.offer(current.left)
                    if (current.right != null) queue.offer(current.right)
                }

                if (xExists && yExists) return true

            }
            if (xExists || yExists) return false
        }

        return false
    }

    /**
     *
     */
    fun isCousins1(root: TreeNode?, x: Int, y: Int): Boolean {
        val xi = dfs(root, null, 0, x)
        val yi = dfs(root, null, 0, y)
        return xi.second == yi.second && xi.first != yi.first
    }

    private fun dfs(root: TreeNode?, fa: TreeNode?, depth: Int, t: Int): Pair<Int, Int> {
        if (root == null) return Pair(-1, -1)
        if (root.`val` == t)
            return Pair(fa?.`val` ?: 1, depth)

        val l = dfs(root.left, root, depth + 1, t)
        if (l.first != -1) return l

        return dfs(root.right, root, depth + 1, t)
    }
}