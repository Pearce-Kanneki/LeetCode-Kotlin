package q01

import q00.TreeNode

/**
 * No.112
 */
class `Path Sum` {

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

        if (root == null) return false
        if (root.left == null && root.right == null) {
            return root.`val` == targetSum
        }
        return hasPathSum(root.left, targetSum - root.`val`) ||
                hasPathSum(root.right, targetSum - root.`val`)
    }
}
