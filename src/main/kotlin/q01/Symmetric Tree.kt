package q01

import q00.TreeNode
import java.util.*

/**
 * No.101
 */
class `Symmetric Tree` {

    /**
     * 更快的解
     */
    fun equals(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null || right == null) return left == right
        if (left!!.`val` != right!!.`val`) return false
        return equals(left?.left, right?.right) && equals(left?.right, right?.left)
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        return equals(root?.left, root?.right)
    }

    /**
     * 快的解
     */
    fun isSymmetric1(root: TreeNode): Boolean {
        return isSameTree(root.left, root.right)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null){
            return true
        }
        if (p == null || q == null){
            return false
        }
        val pStack = LinkedList<TreeNode>()
        val qStack = LinkedList<TreeNode>()
        pStack.push(p)
        qStack.push(q)
        while (!pStack.isEmpty() && !qStack.isEmpty()){
            val pt = pStack.pop()
            val qt = qStack.pop()

            if (!isEqual(pt, qt)){
                return false
            }
            pt.left?.let {pStack.push(it)}
            qt.right?.let {qStack.push(it)}
            pt.right?.let {pStack.push(it)}
            qt.left?.let {qStack.push(it)}
        }
        if (pStack.isEmpty() && qStack.isEmpty()) return true
        return false
    }

    private fun isEqual(pt: TreeNode, qt: TreeNode): Boolean{
        if (pt.`val` != qt.`val`) return false
        if (pt.left == null && qt.right != null) return false
        if (pt.left != null && qt.right == null) return false
        if (pt.right == null && qt.left != null) return false
        if (pt.right != null && qt.left == null) return false
        return true
    }

    /**
     *
     */

    fun isSymmetric2(root: TreeNode?): Boolean {
        return checkData(root?.left, root?.right)
    }

    fun checkData(l: TreeNode?, r: TreeNode?) : Boolean {
        if (l?.`val` == null && r?.`val` == null) return true
        if (l?.`val` == null || r?.`val` == null) return false
        if (l.`val` != r.`val`) return false
        return checkData(l.left, r.right) && checkData(l.right, r.left)
    }
}