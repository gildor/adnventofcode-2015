package utils

class DayRunner(private val inputDir: String) {

    private fun input(dayNumber: Int): String {
        return "$inputDir/input$dayNumber"
    }
    private fun runPartOne(day: Day, inputName: String): String {
        val input = readResource(inputName)
        return day.partOne(input)
    }

    private fun runPartTwo(day: Day, inputName: String): String {
        val input = readResource(inputName)
        return day.partTwo(input)
    }

    fun runPartOne(dayNumber: Int): String {
        return dayNumberToDay(dayNumber)
                .partOne(readResource(input(dayNumber)))
    }

    fun runPartTwo(dayNumber: Int): String {
        return dayNumberToDay(dayNumber)
                .partTwo(readResource(input(dayNumber)))
    }

    fun printResults(dayNumber: Int) {
        val day = dayNumberToDay(dayNumber)
        val input = input(dayNumber)
        println("""

        ${day::class.java.simpleName}
            Part One: ${runPartOne(day, input)}
            Part Two: ${runPartTwo(day, input)}
        """.trimIndent())
    }

    private fun dayNumberToDay(dayNumber: Int): Day {
        val cls = try {
            Class.forName("days.Day$dayNumber")
        } catch (e: ClassNotFoundException) {
            error("Class days.Day$dayNumber with solution doesn't exist")
        }
        if (!Day::class.java.isAssignableFrom(cls)) {
            error("Class with solution days.Day$dayNumber should implement utils.Day interface")
        }
        return cls.newInstance() as Day
    }
}
