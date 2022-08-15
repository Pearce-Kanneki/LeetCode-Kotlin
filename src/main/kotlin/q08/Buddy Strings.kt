package q08

/**
 * NO.859
 */
class `Buddy Strings` {

    /**
     *  較快的解
     */
    fun buddyStrings(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        if (s == goal) return s.groupingBy { it }.eachCount().values.max()!! > 1
        val diff = s.indices.filter { s[it] != goal[it] }
        if (diff.size != 2) return false
        val (d1, d2) = diff
        return s[d1] == goal[d2] && s[d2] == goal[d1]
    }

    /**
     *
     */
    fun buddyStrings1(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        val cnt1 = IntArray(26){ 0 }
        val cnt2 = IntArray(26){ 0 }
        var sum = 0
        for (i in s.indices) {
            cnt1[s[i] - 'a']++
            cnt2[goal[i] - 'a']++
            if (s[i] != goal[i]) sum++
        }

        var ok = false
        for (i in 0 until 26) {
            if (cnt1[i] != cnt2[i]) return false
            if (cnt1[i] > 1) ok = true
        }

        return sum == 2 || (sum == 0 && ok)
    }
}