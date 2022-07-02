package q01

/**
 * No.118
 */
class `Pascal's Triangle` {

    /**
     * 較快的解
     */
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        for(i in 0 until numRows) {
            val model = mutableListOf<Int>()
            for(j in 0 until i+1){
                if(j == 0 || j == (i)) model.add(1)
                else model.add(result[i-1][j - 1] + result[i-1][j])
            }
            result.add(model)
        }
        return result
    }

    fun generate1(numRows: Int): List<List<Int>> {

        val result = mutableListOf<List<Int>>()
        for (i in 0 until numRows) {

            val list = mutableListOf<Int>()
            for (j in 0..i) {
                val tmp = when {
                    i == 0 -> 1
                    j in 1 until i -> result[i - 1][j -1] + result[i -1][j]
                    else -> 1
                }
                list.add(tmp)
            }
            result.add(list)
        }
        return result
    }
}