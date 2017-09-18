package days

import org.junit.Test

import org.junit.Assert.*
import utils.DayRunner

class Day2Test {
    private val day = Day2()

    @Test
    fun partOne() {
        assertEquals(
                "58",
                day.partOne("2x3x4")
        )

        assertEquals(
                "43",
                day.partOne("1x1x10")
        )
    }

    @Test
    fun partTwo() {
        assertEquals(
                "34",
                day.partTwo("2x3x4")
        )

        assertEquals(
                "14",
                day.partTwo("1x1x10")
        )
    }

    @Test
    fun `gildor - partOne`() {
        assertEquals(
                "1588178",
                DayRunner("gildor").runPartOne(2)
        )
    }

    @Test
    fun `gildor - partTwo`() {
        assertEquals(
                "3783758",
                DayRunner("gildor").runPartTwo(2)
        )
    }
}