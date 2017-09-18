package utils

import org.junit.Assert.*
import org.junit.Test
import utils.DayRunner

class DayRunnerTest {
    @Test
    fun printResults() {
        assertEquals("0", DayRunner("test1").runPartOne(1))
    }

}