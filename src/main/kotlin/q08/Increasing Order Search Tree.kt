package q08

import q00.TreeNode
import java.util.*

/**
 * No897
 */
class `Increasing Order Search Tree` {

    /**
     *
     */
    fun increasingBST(root: TreeNode?): TreeNode? {
        val node = TreeNode(1)
        inorder(root, node)
        return node.right
    }

    private fun inorder(current: TreeNode?, result: TreeNode?): TreeNode? {
        if (current == null) return result

        var result = result

        result = inorder(current.left, result)

        result!!.right = current
        val rightCache = current.right
        current.left = null
        current.right = null

        return inorder(rightCache, result.right)
    }

    /**
     *
     */
    fun increasingBST1(root: TreeNode?): TreeNode? {

        if (root == null) return null

        val stack = Stack<TreeNode>()
        pushAllLeft(root, stack)

        var newRoot: TreeNode? = null
        var pointer: TreeNode? = null
        while (stack.isNotEmpty()) {
            val node = stack.pop()

            if (newRoot == null) {
                newRoot = TreeNode(node.`val`)
                pointer = newRoot
            } else {
                pointer?.right = TreeNode(node.`val`)
                pointer = pointer?.right
            }

            pushAllLeft(node.right, stack)
        }

        return newRoot
    }

    private fun pushAllLeft(root: TreeNode?, stack: Stack<TreeNode>) {
        var p = root
        while (p != null) {
            stack.push(p)
            p = p.left
        }
    }
}