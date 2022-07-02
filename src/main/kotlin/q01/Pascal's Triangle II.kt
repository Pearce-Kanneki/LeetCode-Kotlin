package q01

/**
 * No.119
 */
class `Pascal's Triangle II` {

    fun getRow(rowIndex: Int): List<Int> {

        /**
         * 省Ram方法
         */
        fun getRow(rowIndex: Int): List<Int> {

            var result = MutableList<Int>(rowIndex+1){1}

            for(row in 2 .. rowIndex){
                for(col in row-1 downTo 1){
                    result[col] = result[col-1]+result[col]
                }
            }

            return result
        }

        val result = mutableListOf<Int>(1)
        for (i in 0..rowIndex) {

            val tmpList = result.toList()
            result.clear()
            for(j in 0..i){
                if(j == 0 || j == (i)) result.add(1)
                else result.add(tmpList[j - 1] + tmpList[j])
            }
        }

        return result
    }
}