package q01

import q00.TreeNode

/**
 * No.111
 */
class `Minimum Depth of Binary Tree` {

    /**
     * 較快的方法
     */
    fun minDepth(root: TreeNode?): Int {
        if(root == null){
            return 0
        }

        if(root.left == null || root.right == null){
            return  1 + maxOf(minDepth(root.left), minDepth(root.right))
        }

        // if(root.right == null){
        //     return minOf(minDepth(root.left), 0)
        // }


        return 1 + minOf(minDepth(root.left), minDepth(root.right))
    }

    fun minDepth1(root: TreeNode?): Int {

        if(root == null) return 0
        if (root.left == null && root.right == null) return 1

        var minDepth = Int.MAX_VALUE
        root.left?.let { minDepth = minOf(minDepth(it), minDepth) }
        root.right?.let { minDepth = minOf(minDepth(it), minDepth) }
        return minDepth + 1
    }
}