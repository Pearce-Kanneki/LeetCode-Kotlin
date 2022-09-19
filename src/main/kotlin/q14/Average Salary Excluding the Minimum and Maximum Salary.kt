package q14

/**
 * No.1491
 */
class `Average Salary Excluding the Minimum and Maximum Salary` {

    fun average(salary: IntArray): Double {
        salary.sort()
        var sum = .0
        for (i in 1 until salary.lastIndex) {
            sum += salary[i]
        }

        return sum / (salary.size - 2)
    }
}