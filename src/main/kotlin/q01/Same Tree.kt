package q01

import q00.TreeNode

/**
 * No.100
 */
class `Same Tree` {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

        if (p == null && q == null) return true

        if (p?.`val` == q?.`val`) {
            return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)


        } else return false
    }

    fun isSameTree1(p: TreeNode?, q: TreeNode?): Boolean {

        if (p?.`val` != q?.`val`) return false
        if (p?.left == null && q?.left == null && p?.right == null && q?.right == null) return true
        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}