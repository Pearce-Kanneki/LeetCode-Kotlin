package q02

/**
 * No.278
 */
class `First Bad Version` {

    /**
     * 快
     */
    fun firstBadVersion(n: Int) : Int {
        var left = 0
        var right = n - 1
        var mid: Int
        while (left <= right) {
            mid = left + (right - left) / 2
            if (isBadVersion(mid)) right = mid - 1
            else left = mid + 1
        }
        return left
    }

    fun firstBadVersion1(n: Int) : Int {

        var max = n
        var min = 1

        while (max >= min) {
            val mid = min + (max - min) / 2
            if (isBadVersion(mid)) {
                max = mid - 1
            } else {
                min = mid + 1
            }
        }

        return min
    }

    //
    fun isBadVersion(version: Int) : Boolean { return version == 3}
}