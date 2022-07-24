package q05

/**
 * No.551
 */
class `Student Attendance Record I` {

    fun checkRecord(s: String): Boolean {

        var a = 0
        var late = 0

        for (i in s.indices) {

            when(s[i]) {
                'A' -> {
                    ++a
                    late = 0
                }
                'L' -> late++
                else -> late = 0
            }

            if (a > 2 || late >= 3) break
        }

        return a < 2 && late < 3
    }
}