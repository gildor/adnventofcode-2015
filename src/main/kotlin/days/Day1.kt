package days

import utils.Day
import utils.DayRunner

class Day1 : Day {

    override fun partOne(input: String) =
            input.sumBy {
                when (it) {
                    '(' -> +1
                    ')' -> -1
                    else -> 0
                }
            }.toString()

    override fun partTwo(input: String): String {
        input.foldIndexed(0) { i, acc, c ->
            when (c) {
                '(' -> acc + 1
                ')' -> acc - 1
                else -> acc
            }.also { floor ->
                if (floor == -1) {
                    return "${i + 1}"
                }
            }
        }

        error("No answer")
    }

}
