package q01

import q00.TreeNode
import java.util.*

/**
 * No.145
 */
class `Binary Tree Postorder Traversal` {

    /**
     * 較快的方法
     */
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val result = LinkedList<Int>()
        if (root == null) return result
        val stack = Stack<TreeNode>()
        stack.push(root)
        while (stack.isNotEmpty()) {
            val item = stack.pop()
            result.add(0, item.`val`)
            item.left?.let { stack.push(it) }
            item.right?.let { stack.push(it) }
        }
        return result
    }

    /**
     *
     */
    var r = mutableListOf<Int>()
    fun postorderTraversal1(root: TreeNode?): List<Int> {

        if (root == null) return emptyList()
        postorder(root)
        return r
    }

    fun postorder(root: TreeNode) {
        root.left?.let { postorder(it) }
        root.right?.let { postorder(it) }
        r.add(root.`val`)
    }
}