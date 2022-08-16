package q08

import q00.TreeNode
import java.util.LinkedList

/**
 * No.872
 */
class `Leaf-Similar Trees` {

    /**
     * 較快的解
     */
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val firstTreeSet = mutableListOf<Int>()
        val secondTreeSet = mutableListOf<Int>()
        root1!!.addTreeLeafs(firstTreeSet)
        root2!!.addTreeLeafs(secondTreeSet)
        return firstTreeSet == secondTreeSet
    }

    private fun TreeNode.addTreeLeafs(set: MutableList<Int>) {
        left?.addTreeLeafs(set)
        right?.addTreeLeafs(set)
        if (isLeaf()) {
            set.add(`val`)
        }
    }

    private fun TreeNode.isLeaf(): Boolean = left == null && right == null

    /**
     *
     */
    fun leafSimilar1(root1: TreeNode?, root2: TreeNode?): Boolean {

        val leafSeq1 = LinkedList<TreeNode>()
        inorder(root1, leafSeq1)
        val leafSeq2 = LinkedList<TreeNode>()
        inorder(root2, leafSeq2)

        return leafSeq1.size == leafSeq2.size && leafSeq1.zip(leafSeq2).none { it.first.`val` != it.second.`val` }
    }

    fun inorder(root: TreeNode?, queue: LinkedList<TreeNode>) {
        root?.let {
            inorder(root.left, queue)
            if (root.left == null && root.right == null) {
                queue.offer(root)
            }
            inorder(root.right, queue)
        }
    }
}