package q06

import q00.TreeNode

/**
 * No.606
 */
class `Construct String from Binary Tree` {

    /**
     * 較快的方法
     */
    fun tree2str(root: TreeNode?): String {
        return toStringFormattedHelper(root)
    }

    private fun toStringFormattedHelper(node: TreeNode?) : String{
        if(node == null) return ""
        return buildString{
            append(node.`val`)
            when{
                node.left != null && node.right != null ->
                    append("(${toStringFormattedHelper(node.left)})(${toStringFormattedHelper(node.right)})")

                node.left != null && node.right == null ->
                    append("(${toStringFormattedHelper(node.left)})")

                node.left == null && node.right != null ->
                    append("()(${toStringFormattedHelper(node.right)})")
            }
        }
    }

    /**
     *
     */
    fun tree2str2(root: TreeNode?): String {
        if (root == null) return ""
        var result = root.`val`.toString()
        root.left?.let {
            result += "(${tree2str2(it)})"
        }
        root.right?.let {
            if (root.left == null) result += "()"
            result += "(${tree2str2(it)})"
        }

        return result
    }
}