package q08

/**
 * No.836
 */
class `Rectangle Overlap` {

    /**
     *
     */
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0],rec2[0])) &&
                (Math.min(rec1[3], rec2[3])>Math.max(rec1[1],rec2[1]))
    }

    /**
     *
     */
    fun isRectangleOverlap1(rec1: IntArray, rec2: IntArray): Boolean {
        val x = (rec1[2] <= rec2[0]) || (rec2[2] <= rec1[0])
        val y = (rec1[3] <= rec2[1]) || (rec2[3] <= rec1[1])
        return !x && !y
    }
}