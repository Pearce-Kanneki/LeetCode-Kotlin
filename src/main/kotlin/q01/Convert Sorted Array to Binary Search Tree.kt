package q01

import q00.TreeNode

/**
 * No.108
 */
class `Convert Sorted Array to Binary Search Tree` {

    /**
     * 更快的解
     */
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return helper(nums, 0, nums.size-1)
    }

    fun helper(nums:IntArray, l: Int, r: Int): TreeNode? {
        if(l > r) return null
        val mid = l+ (r-l)/2
        val node = TreeNode(nums[mid])
        node.left = helper(nums, l, mid-1)
        node.right = helper(nums, mid+1, r)
        return node
    }

    /**
     *
     */
    fun sortedArrayToBST1(nums: IntArray): TreeNode? {

        return if (nums.isEmpty()) null else sortedArrayHelper(nums, 0, nums.lastIndex)
    }

    fun sortedArrayHelper(nums: IntArray, low: Int, hight: Int): TreeNode? {
        if (low > hight) return null
        val mid = (low + hight) / 2
        return TreeNode(nums[mid]).apply {
            left = sortedArrayHelper(nums, low, mid - 1)
            right = sortedArrayHelper(nums, mid + 1, hight)
        }
    }
}