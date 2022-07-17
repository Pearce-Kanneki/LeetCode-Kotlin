package q02

import q00.TreeNode

/**
 * No.257
 */
class `Binary Tree Paths` {

    fun binaryTreePaths(root: TreeNode?): List<String> {

        if(root == null) return emptyList()
        return dfs(root, "${root.`val`}")
    }

    fun dfs(root: TreeNode?, node: String): List<String> {

        if (root?.left == null && root?.right == null) return listOf(node)
        val result = mutableListOf<String>()

        root.left?.let {
            val item = dfs(it, "$node->${it.`val`}")
            result.addAll(item)
        }
        root.right?.let {
            val item = dfs(it, "$node->${it.`val`}")
            result.addAll(item)
        }

        return result
    }


}