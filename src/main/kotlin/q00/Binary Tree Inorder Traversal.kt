package q00

import java.util.*

/**
 * No.94
 */
class `Binary Tree Inorder Traversal` {

    fun inorderTraversal(root: TreeNode?): List<Int> {

        val result = mutableListOf<Int>()
        val queue = LinkedList<TreeNode>()

        var node = root
        while (node != null) {
            queue.push(node)
            node = node.left
        }

        while (queue.isNotEmpty()) {
            val item = queue.poll()
            result.add(item.`val`)
            node = item.right
            while (node != null) {
                queue.push(node)
                node = node.left
            }
        }

        return result
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}