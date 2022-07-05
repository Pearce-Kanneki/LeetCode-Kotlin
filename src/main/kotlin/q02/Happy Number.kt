package q02

/**
 * No.202
 */
class `Happy Number` {

    fun isHappy(n: Int): Boolean {

        if (n == 1) return true
        var result = n
        val checkList = mutableListOf<Int>()

        while (result != 1) {

            val list = mutableListOf<Int>()
            while (result > 0) {
                list.add(result % 10)
                result /= 10
            }
            result = list.map { it * it }.sum()
            if (checkList.any { it == result }) return false
            checkList.add(result)
        }

        return true
    }

    /**
     * 較省資源
     */
    fun isHappy1(n: Int): Boolean {
        val loopedNums = HashSet<Int>()
        var num = n
        while (!loopedNums.contains(num) && num != 1) {
            loopedNums.add(num)
            num = transformNum(num)
        }

        return num == 1
    }

    fun transformNum(n: Int): Int {
        var result = 0
        var num = n
        while (num > 0) {
            result += (num % 10) * (num % 10)
            num /= 10
        }

        return result
    }
}