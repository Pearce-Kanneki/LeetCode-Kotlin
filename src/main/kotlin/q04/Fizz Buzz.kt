package q04

/**
 * No.412
 */
class `Fizz Buzz` {

    /**
     * 較快的解
     */
    fun fizzBuzz(n: Int): List<String> {

        val result = mutableListOf<String>()
        var mod3 = 0
        var mod5 = 0

        for (i in 1..n) {
            mod3++
            mod5++

            when {
                mod3 == 3 && mod5 == 5 -> {
                    result.add("FizzBuzz")
                    mod5 = 0
                    mod3 = 0
                }
                mod3 == 3 -> {
                    result.add("Fizz")
                    mod3 = 0
                }
                mod5 == 5 -> {
                    result.add("Buzz")
                    mod5 = 0
                }
                else -> result.add(i.toString())
            }
        }

        return result
    }

    /**
     *
     */
    fun fizzBuzz1(n: Int): List<String> {

        val result = mutableListOf<String>()

        for (i in 1..n) {
            val mod3 = (i % 3) == 0
            val mod5 = (i % 5) == 0

            when {
                mod3 && mod5 -> result.add("FizzBuzz")
                mod3 -> result.add("Fizz")
                mod5 -> result.add("Buzz")
                else -> result.add(i.toString())
            }
        }

        return result
    }
}