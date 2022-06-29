package q00

/**
 * No.13
 */
class `Roman to Integer` {

    /**
     * 目前個人解
     */
    fun romanToInt(s: String): Int {
        var sum = 0
        s.split("").map { stringChangerInt(it) }.run {
            forEachIndexed { index, item ->
                if (index < size -1 && item >= this[index + 1]){
                    sum += item
                } else {
                    sum -= item
                }
            }
        }

        return sum
    }

    fun stringChangerInt(s: String): Int {
        return when(s) {
            "I" -> 1
            "V" -> 5
            "X" -> 10
            "L" -> 50
            "C" -> 100
            "D" -> 500
            "M" -> 1000
            else -> 0
        }
    }

    /**
     * 他人不錯的解
     */
    fun romanToInt2(s: String): Int {
        val hashMap:HashMap<String, Int> = hashMapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )


        var result = hashMap.get(s[s.length-1].toString())!!
        for(i in s.length-2 downTo 0){
            hashMap.get(s[i].toString())?.let{index1->
                hashMap.get(s[i+1].toString())?.let{index2->
                    if(index1<index2){
                        result-= index1
                    }else{
                        result+= index1
                    }
                }
            }
        }
        return result
    }

    /**
     * 他人不錯的解
     */
    fun romanToInt3(s: String): Int {
        val map = mutableMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        var number = 0
        var last = 1000
        s.forEach {
            val value = map[it] ?: 0
            if (value > last) number -= last * 2
            number += value
            last = value
        }

        return number
    }
}