package q05

/**
 * No.559
 */
class `Maximum Depth of N-ary Tree` {

    /**
     * 較快的方法
     */
    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        if (root.children.isEmpty()) return 1
        return root.children.map { maxDepth(it) }.max()!! + 1
    }

    /**
     * 較省
     */
    fun maxDepth1(root: Node?): Int {
        if(root==null) return 0
        var maxH = 0
        for(node in root.children){
            val height = maxDepth(node)
            maxH = if(height>maxH) height else maxH
        }
        return maxH+1
    }

    fun maxDepth2(root: Node?): Int {

        if (root == null) return 0
        var maxSum = 0
        root.children.forEach {
            maxSum = Math.max(maxSum, maxDepth(it))
        }

        return maxSum + 1
    }
}

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}