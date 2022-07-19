package q04

import java.util.*

/**
 * No.455
 */
class `Assign Cookies` {

    /**
     *
     */
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        Arrays.sort(g)
        Arrays.sort(s)

        var child = 0
        var cookie = 0

        while(child < g.size && cookie < s.size) {
            if(s[cookie] >= g[child]) {
                child++
            }
            cookie++
        }
        return child
    }

    /**
     *
     */
    fun findContentChildren1(g: IntArray, s: IntArray): Int {

        if (s.isEmpty()) return 0

        g.sort()
        s.sort()

        var count = 0
        var gIndex = 0
        var sIndex = 0
        while (gIndex < g.size && sIndex < s.size) {

            if (g[gIndex] <= s[sIndex]) {
                gIndex++
                sIndex++
                count++
            } else {
                sIndex++
            }
        }

        return count
    }
}