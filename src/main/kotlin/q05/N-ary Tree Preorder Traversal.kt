package q05

/**
 * No.589
 */
class `N-ary Tree Preorder Traversal` {

    /**
     * 較快的解
     */
    fun preorder(root: Node?): List<Int> {
        val ans = mutableListOf<Int>()
        val arrQ = ArrayDeque<Node>()

        if(root==null) return ans

        arrQ.add(root)

        while(!arrQ.isEmpty()){
            val select = arrQ.removeFirst()
            val children = select.children

            ans.add(select.`val`)

            for (i in children.size-1 downTo 0){
                children[i]?.let {
                    arrQ.addFirst(it)
                }
            }
        }

        return ans
    }

    /**
     *
     */
    val result = mutableListOf<Int>()
    fun preorder1(root: Node?): List<Int> {
        preDfs(root)
        return result
    }

    fun preDfs(node:Node?) {
        if (node == null) return
        result.add(node.`val`)
        node.children.forEach {
            preDfs(it)
        }
    }
}