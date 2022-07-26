package q05

/**
 * No.590
 */
class `N-ary Tree Postorder Traversal` {

    /**
     * 較快的解
     */
    fun postorder(root: Node?): List<Int> {
        val path = mutableListOf<Int>()
        onNextNode(root, path)
        return path
    }

    private fun onNextNode(parent: Node?, path: MutableList<Int>) {
        parent?.let { node ->
            parent.children.forEach { child ->
                onNextNode(child, path)
            }
            path.add(node.`val`)
        }
    }

    /**
     *
     */
    fun postorder1(root: Node?): List<Int> {

        val result = mutableListOf<Int>()
        posDfs(root, result)

        return result
    }

    fun posDfs(node: Node?, result: MutableList<Int>) {

        if (node == null) return
        node.children.forEach {
            posDfs(it, result)
        }
        result.add(node.`val`)
    }
}