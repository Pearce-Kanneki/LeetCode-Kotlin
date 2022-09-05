package q11

import java.time.DayOfWeek
import java.time.LocalDate

/**
 * No.1185
 */
class `Day of the Week` {

    /**
     *
     */
    fun dayOfTheWeek(day: Int, month: Int, year: Int): String {
        val week = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        val days = intArrayOf(31, if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 29 else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var count = 0

        for (i in 1971 until year) count += if (i % 4 == 0) 366 else 365
        for (i in 0 until month - 1) count += days[i]

        return week[(count + day + 4) % 7]
    }

    /**
     *
     */
    fun dayOfTheWeek1(day: Int, month: Int, year: Int): String {
        val ans = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val localDate = LocalDate.of(year, month, day)
        var dw = DayOfWeek.from(localDate).value

        if (dw !in 1..7)
            dw = 1

        return ans[dw - 1]
    }
}